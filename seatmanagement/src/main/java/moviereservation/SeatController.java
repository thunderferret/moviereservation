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

                int seatqty = Integer.parseInt(request.getParameter("seatQty"));
                System.out.println("##### seatQty : " + request.getParameter("seatQty") + "Current Seat : " + nTotalCount);

                if(nTotalCount > seatqty){
                        nTotalCount = nTotalCount - seatqty;
                        ret = true;
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

                int seatqty = Integer.parseInt(request.getParameter("seatQty"));
                System.out.println("##### seatQty : " + request.getParameter("seatQty") + "Current Seat : " + nTotalCount);

                if(seatqty + nTotalCount <= 100){
                        nTotalCount = nTotalCount + seatqty;
                        ret = true;
                }

                return ret;
        }
 }
