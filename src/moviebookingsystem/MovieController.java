package moviebookingsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>> cityVsMovie;
    List<Movie> movies;

    public MovieController() {
        this.cityVsMovie = new HashMap<>();
        this.movies = new ArrayList<>();
    }
    public void addMovie(City city, Movie movie) {
        movies.add(movie);
        List<Movie> movieList = cityVsMovie.getOrDefault(city, new ArrayList<>());
        movieList.add(movie);
        cityVsMovie.put(city, movieList);
    }

    public Movie getMovieByName(String movieName) {
        for(Movie movie: movies) {
            if(movie.name.equals(movieName))
                return movie;
        }
        return null;
    }

    public List<Movie> getMovieByCity(City city) {
        return cityVsMovie.getOrDefault(city, new ArrayList<>());
    }
}
