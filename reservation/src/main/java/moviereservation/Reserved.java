package moviereservation;

public class Reserved extends AbstractEvent {

    private Long id;
    private String movieName;
    private String customerName;
    private String reservationStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getStatus() {
        return reservationStatus;
    }

    public void setStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }
}