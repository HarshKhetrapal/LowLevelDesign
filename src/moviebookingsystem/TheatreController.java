package moviebookingsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    Map<City, List<Theatre>> cityVsTheatre;
    List<Theatre> theatres;

    public TheatreController() {
        this.cityVsTheatre = new HashMap<>();
        this.theatres = new ArrayList<>();
    }

    public void addTheatre(City city, Theatre theatre) {
        this.theatres.add(theatre);
        List<Theatre> theatreList = this.cityVsTheatre.getOrDefault(city, new ArrayList<>());
        theatreList.add(theatre);
        cityVsTheatre.put(city, theatreList);
    }

    public Map<Theatre, List<Show>> getAllShowsForMovieInCity(City city, Movie movie) {
        Map<Theatre, List<Show>> theatreVsShow = new HashMap<>();
        List<Theatre> theatreList = cityVsTheatre.get(city);
        for (Theatre theatre: theatreList) {
            List<Show> movieShowList = new ArrayList<>();
            List<Show> showList = theatre.getShows();
            for (Show show: showList) {
                if (show.movie.id == movie.id)
                    movieShowList.add(show);
            }
            if (!movieShowList.isEmpty())
                theatreVsShow.put(theatre, movieShowList);
        }
        return theatreVsShow;
    }
}
