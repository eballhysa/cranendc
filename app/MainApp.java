package app;

import cranendc.CraneNDCService;
import cranendc.CraneNDCServiceImpl;
import org.iata.iata._2015._00._2020_1.iata_airshoppingrq.*;
import org.iata.iata._2015._00._2020_1.iata_airshoppingrs.IATAAirShoppingRS;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import org.iata.iata._2015._00._2020_1.iata_airshoppingrq.ShoppingCriteriaType;

public class MainApp {

    private static final String NDC_ENDPOINT = "https://book-htt.crane.aero/cranendc/v20.1/CraneNDCService";
    private static final String USERNAME = "**username**";
    private static final String PASSWORD = "**password**";

    public static void main(String[] args) {
        CraneNDCServiceImpl service = new CraneNDCServiceImpl();
        CraneNDCService port = service.getCraneNDCSOAP();
        BindingProvider bp =  (BindingProvider) port;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, NDC_ENDPOINT);
        Map<String, List<String>> httpHeaders = new HashMap<>();
        httpHeaders.put("userName", Collections.singletonList(USERNAME));
        httpHeaders.put("password", Collections.singletonList(PASSWORD));
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, NDC_ENDPOINT);
        bp.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);

        IATAAirShoppingRQ req = createRequest("SAW", "ESB", "2024-01-26");
        IATAAirShoppingRS res = port.doAirShopping(req);
        String echo = res.getPayloadAttributes().getEchoTokenText();
        System.out.println(echo);
        if ( ! res.getError().isEmpty() )
            res.getError().stream().map(e -> e.getCode() + " " + e.getDescText()).forEach(System.out::println);
        else {
            int count = res.getResponse().getOffersGroup().getCarrierOffers().get(0).getOffer().size();
            System.out.println("Received " + count + " offers");
            res.getResponse().getOffersGroup().getCarrierOffers().get(0).getOffer().forEach(offer -> {
                System.out.println(offer.getTotalPrice().getTotalAmount().getValue() + " " + offer.getTotalPrice().getTotalAmount().getCurCode() + ": " + offer.getOfferID());
            });
        }
    }

    private static IATAAirShoppingRQ createRequest(String dep, String arr, String date) {
        IATAAirShoppingRQ request = new IATAAirShoppingRQ();

        request.setMessageDoc(new MessageDocType());
        request.getMessageDoc().setName("NDC GATEWAY");
        request.getMessageDoc().setRefVersionNumber(new BigDecimal(20.1));

        request.setParty(new PartyType());
        request.getParty().setSender(new SenderType());
        request.getParty().getSender().setTravelAgency(new TravelAgencyType());
        request.getParty().getSender().getTravelAgency().setAgencyID(USERNAME);

        OriginDestCriteriaType odCriteria = new OriginDestCriteriaType();
        odCriteria.setOriginDepCriteria(new OriginDepCriteriaType());
        odCriteria.getOriginDepCriteria().setIATALocationCode(dep);
        odCriteria.getOriginDepCriteria().setDate(toXMLCalendar(date));
        odCriteria.setDestArrivalCriteria(new DestArrivalCriteriaType());
        odCriteria.getDestArrivalCriteria().setIATALocationCode(arr);
        odCriteria.getPreferredCabinType().add(new CabinTypeType());
        odCriteria.getPreferredCabinType().get(0).setCabinTypeCode("Y");
        request.setRequest(new RequestType());
        request.getRequest().setFlightRequest(new FlightRequestType());
        request.getRequest().getFlightRequest().getOriginDestCriteria().add(odCriteria);

        request.getRequest().setPaxs(new PaxsType());
        request.getRequest().getPaxs().getPax().add(new PaxType());
        request.getRequest().getPaxs().getPax().get(0).setPaxID("SH1");
        request.getRequest().getPaxs().getPax().get(0).setPTC("ADT");

        request.getRequest().setResponseParameters(new ResponseParametersType());
        request.getRequest().getResponseParameters().getCurParameter().add(new CurParameterType());
        request.getRequest().getResponseParameters().getCurParameter().get(0).setRequestedCurCode("TRY");
        request.getRequest().getResponseParameters().getLangUsage().add(new LangUsageType());
        request.getRequest().getResponseParameters().getLangUsage().get(0).setLangCode("EN");

        request.getRequest().setShoppingCriteria(new ShoppingCriteriaType());
        request.getRequest().getShoppingCriteria().getConnectionCriteria().add(new ConnectionCriteriaType());
        request.getRequest().getShoppingCriteria().getConnectionCriteria().get(0).setConnectionPrefID("");
        request.getRequest().getShoppingCriteria().getConnectionCriteria().get(0).setInterlineInd(false);

        return request;
    }

    public static XMLGregorianCalendar toXMLCalendar(String strDate) {
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
            return toXMLCalendarDefaultTimezone(date);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static XMLGregorianCalendar toXMLCalendarDefaultTimezone(Date date) {
        if (date == null)
            return null;

        try {
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(date);
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
