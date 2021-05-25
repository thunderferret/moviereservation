package moviereservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 @RestController
 public class SeatController {

        // modified by jungilkim (Added Code)
        public int nTotalCount = 100;

        // modified by jungilkim (Added Code)
        @Autowired
        SeatRepository seatRepository;

@RequestMapping(value = "/reserveSeat",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8")

public boolean seatRequest(HttpServletRequest request, HttpServletResponse response)
        throws Exception {
                // modified by jungilkim (Added Code)
                boolean ret =  false;

                //int seatqty = Integer.parseInt(request.getParameter("seatQty"));
                long reservationId = Long.valueOf(request.getParameter("reservationId"));
                System.out.println("##### reservationId : " + request.getParameter("reservationId") + "Current Seat : " + nTotalCount);

                if(nTotalCount > 0){
                        nTotalCount = nTotalCount - 1;
                        ret = true;
                 
                        Seat seat = new Seat();
                        seat.setReservationId(reservationId);
                        seatRepository.save(seat);
                }

                return ret;
        }

@RequestMapping(value = "/cancelReserveSeat",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8")

public boolean seatCancel(HttpServletRequest request, HttpServletResponse response)
        throws Exception {
                // modified by jungilkim (Added Code)
                boolean ret =  false;

                //int seatqty = Integer.parseInt(request.getParameter("seatQty"));
                long reservationId = Long.valueOf(request.getParameter("reservationId"));
                System.out.println("##### reservationId : " + request.getParameter("reservationId") + "Current Seat : " + nTotalCount);

                if(nTotalCount < 100){
                        nTotalCount = nTotalCount + 1;
                        ret = true;
                 
                        Seat seat = new Seat();
                        seat.setReservationId(reservationId);
                        seatRepository.save(seat);
                }

                return ret;
        }
 }
