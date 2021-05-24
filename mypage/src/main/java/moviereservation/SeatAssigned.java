
package moviereservation;

public class SeatAssigned extends AbstractEvent {

    private Long id;
    private Long reservationId;
    private Long seatQty;

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
    public Long getSeatQty() {
        return seatQty;
    }

    public void setSeatQty(Long seatQty) {
        this.seatQty = seatQty;
    }
}

