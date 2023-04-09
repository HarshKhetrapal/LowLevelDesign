package moviebookingsystem;

import java.util.List;

public class Screen {
    public int id;
    public List<Seat> seats;

    public Screen(int id, List<Seat> seats) {
        this.id = id;
        this.seats = seats;
    }
}
