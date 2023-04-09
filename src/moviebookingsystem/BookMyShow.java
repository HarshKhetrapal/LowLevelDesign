package moviebookingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {
    MovieController movieController;
    TheatreController theatreController;
    //TODO: Need to fix Below
    City BengaluruCity = new City("Bengaluru");
    City DelhiCity = new City("Bengaluru");

    public BookMyShow() {
        this.movieController = new MovieController();
        this.theatreController = new TheatreController();
    }

    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.intialize();

        bookMyShow.createBooking(bookMyShow.BengaluruCity, "Bahubali");
        bookMyShow.createBooking(bookMyShow.BengaluruCity, "Bahubali");

    }

    private void createBooking(City city, String movieName) {
        List<Movie> listAllMovieByCity = this.movieController.getMovieByCity(city);
        Movie movieRequested = null;
        for(Movie movie: listAllMovieByCity) {
            if(movie.getName().equals(movieName)) {
                movieRequested = movie;
                break;
            }
        }

        Map<Theatre, List<Show>> theatreVsShows = this.theatreController.getAllShowsForMovieInCity(city, movieRequested);

        Map.Entry<Theatre,List<Show>> entry = theatreVsShows.entrySet().iterator().next();
        List<Show> runningShows = entry.getValue();
        Show interestedShow = runningShows.get(0);

        int selectSeatNumber = 30;
        List<Integer> listOfBookedSeat = interestedShow.bookedSeatIds;
        if (!listOfBookedSeat.contains(selectSeatNumber)) {
            listOfBookedSeat.add(selectSeatNumber);
            Booking booking = new Booking();
            booking.setShow(interestedShow);
            List<Seat> myBookedSeats = new ArrayList<>();
            for (Seat seat: interestedShow.screen.seats) {
                if (seat.getId() == selectSeatNumber)
                    myBookedSeats.add(seat);
            }
            booking.setSeatsToBook(myBookedSeats);
        }
        else {
            System.out.println("seat already booked, try again");
            return;
        }
        System.out.println("Booking Successful");
    }

    public void intialize() {
        createMovies();

        createTheatre();
    }

    private void createTheatre() {
        Movie bahubaliMovie = this.movieController.getMovieByName("Bahubali");
        Movie ltrMovie = this.movieController.getMovieByName("Lucky the racer");

        Theatre inoxTheatre = new Theatre(1, this.BengaluruCity, this.createScreens());
        inoxTheatre.addShow(new Show(1, bahubaliMovie, inoxTheatre.getScreens().get(0), 9));
        inoxTheatre.addShow(new Show(2, ltrMovie, inoxTheatre.getScreens().get(0), 21));

        Theatre pvrTheatre = new Theatre(2, this.DelhiCity, this.createScreens());
        pvrTheatre.addShow(new Show(1, bahubaliMovie, pvrTheatre.getScreens().get(0), 10));
        pvrTheatre.addShow(new Show(2, ltrMovie, pvrTheatre.getScreens().get(0), 18));

        this.theatreController.addTheatre(this.BengaluruCity, inoxTheatre);
        this.theatreController.addTheatre(this.DelhiCity, pvrTheatre);
    }

    private List<Screen> createScreens() {
        List<Screen> screens = new ArrayList<>();
        Screen screen = new Screen(1, this.createSeats());
        screens.add(screen);
        return screens;
    }

    private List<Seat> createSeats() {
        List<Seat> seats = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            Seat seat = new Seat(i, 1, SeatCategory.Silver, 100);
            seats.add(seat);
        }

        for (int i = 40; i < 70; i++) {
            Seat seat = new Seat(i, 2, SeatCategory.Gold, 200);
            seats.add(seat);
        }

        for (int i = 70; i < 100; i++) {
            Seat seat = new Seat(i, 5, SeatCategory.Platinum, 500);
            seats.add(seat);
        }
        return seats;
    }

    private void createMovies() {
        Movie movie1 = new Movie(1, "Bahubali", 60);
        Movie movie2 = new Movie(2, "Lucky the racer", 100);

        this.movieController.addMovie(this.BengaluruCity, movie1);
        this.movieController.addMovie(this.DelhiCity, movie1);
        this.movieController.addMovie(this.BengaluruCity, movie2);
        this.movieController.addMovie(this.DelhiCity, movie2);
    }
}
