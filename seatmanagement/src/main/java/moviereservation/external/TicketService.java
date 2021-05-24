
package moviereservation.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="ticketmanagement", url="http://ticketmanagement:8080")
public interface TicketService {

    @RequestMapping(method= RequestMethod.GET, path="/tickets")
    public void cancelTicket(@RequestBody Ticket ticket);

}