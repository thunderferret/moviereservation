
package moviereservation.external;

import org.apache.logging.log4j.util.StringBuilderFormattable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// modified by jungilkim (PORT 8080->8084)
@FeignClient(name="ticketmanagement", url="http://ticketmanagement:8084")
public interface TicketService {

    @RequestMapping(method= RequestMethod.GET, path="/cancelTicket")
    // modified by jungilkim
    public void cancelTicket(@RequestParam("reservationId") Long reservationId, @RequestParam("reservationId") String ticketStatus);
}