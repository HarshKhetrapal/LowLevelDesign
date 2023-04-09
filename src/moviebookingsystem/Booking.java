package moviebookingsystem;

import java.util.List;

public class Booking {
    Show show;
    Payment payment;
    List<Seat> seatsToBook;

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public List<Seat> getSeatsToBook() {
        return seatsToBook;
    }

    public void setSeatsToBook(List<Seat> seatsToBook) {
        this.seatsToBook = seatsToBook;
    }
}
