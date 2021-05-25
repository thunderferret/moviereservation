package moviereservation;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name = "Payment_table")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long reservationId;
    private Long payPrice;
    private String paymentStatus;

    @PostPersist
    public void onPostPersist() {
        Approved approved = new Approved();
        BeanUtils.copyProperties(this, approved);
        approved.setStatus("approved");
        approved.publishAfterCommit();

        // Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        moviereservation.external.Seat seat = new moviereservation.external.Seat();
        // mappings goes here
        PaymentApplication.applicationContext.getBean(moviereservation.external.SeatService.class).reserveSeat(seat);

    }

    @PostUpdate
    public void onPostUpdate() {
        PayCancelled payCancelled = new PayCancelled();
        BeanUtils.copyProperties(this, payCancelled);
        payCancelled.setStatus("cancelled");
        payCancelled.publishAfterCommit();

        // Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        moviereservation.external.Seat seat = new moviereservation.external.Seat();
        // mappings goes here
        PaymentApplication.applicationContext.getBean(moviereservation.external.SeatService.class)
                .cancelReserveSeat(seat);

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public Long getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(Long payPrice) {
        this.payPrice = payPrice;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

}
