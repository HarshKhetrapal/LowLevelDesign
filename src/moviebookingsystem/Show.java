package moviebookingsystem;

import java.util.ArrayList;
import java.util.List;

public class Show {
    int showId;
    Movie movie;
    Screen screen;
    int startTime;
    List<Integer> bookedSeatIds;

    public Show(int showId, Movie movie, Screen screen, int startTime) {
        this.showId = showId;
        this.movie = movie;
        this.screen = screen;
        this.startTime = startTime;
        this.bookedSeatIds = new ArrayList<>();
    }

    public int getShowId() {
        return showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public int getStartTime() {
        return startTime;
    }

    public List<Integer> getBookedSeatIds() {
        return bookedSeatIds;
    }

    public void updateBookedSeatIds(Seat seat) {
        this.bookedSeatIds.add(seat.getId());
    }
}
