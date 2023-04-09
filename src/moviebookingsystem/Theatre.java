package moviebookingsystem;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    int id;
    City city;
    List<Screen> screens;
    List<Show> shows;

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public Theatre(int id, City city, List<Screen> screens) {
        this.id = id;
        this.city = city;
        this.screens = screens;
        this.shows = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public City getCity() {
        return city;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void addShow(Show show) {
        this.shows.add(show);
    }

    public void addScreen(Screen screen) {
        this.screens.add(screen);
    }
}
