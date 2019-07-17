package Servers;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Handler {
    @WebMethod
    String addEvent(String id, String eid, String et, int capacity);
    @WebMethod
    String removeEvent(String id, String eid, String et);
    @WebMethod
    String listEventAvailability(String id, String et);
    @WebMethod
    String bookEvent(String cid, String mid, String eventId, String et);
    @WebMethod
    String cancelEvent(String cid, String mid, String eventId, String et);
    @WebMethod
    String getBookingSchedule(String id, String mid);
    @WebMethod
    String authenEntry(String id, String req);
    @WebMethod
    String getRequestList(String id);
    @WebMethod
    String signup(String id);
    @WebMethod
    String login(String id);
    @WebMethod
    String swapEvent(String cid, String mid, String neid, String net, String oeid, String oet);
}
