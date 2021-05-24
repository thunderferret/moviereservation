package moviereservation.external;

public class Payment {

    private Long id;
    private Long reservationId;
    private Long payPrice;
    private String paymentStatus;

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
