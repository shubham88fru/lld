//package systemdesign.movieticketbooking;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class BookMyShow {
//    MovieController movieController;
//    TheaterController theaterController;
//
//    BookMyShow() {
//        movieController = new MovieController();
//        theaterController = new TheaterController();
//    }
//
//    private void initialize() {
//        createMovies();
//
//        createTheater();
//    }
//
//    private void createMovies() {
//        Movie avengers = new Movie();
//        avengers.setMovieId(1);
//        avengers.setMovieName("AVENGERS");
//        avengers.setMovieDurationInMinutes(128);
//
//        Movie bahubali = new Movie();
//        bahubali.setMovieId(2);
//        bahubali.setMovieName("BAHUBALI");
//        bahubali.setMovieDurationInMinutes(128);
//
//        movieController.addMovie(avengers, City.MUMBAI);
//        movieController.addMovie(bahubali, City.MUMBAI);
//        movieController.addMovie(avengers, City.BANGALORE);
//    }
//
//    private void createTheater() {
//        Movie avengerMovie = movieController.getMovieByName("AVENGERS");
//        Movie bahubali = movieController.getMovieByName("BAHUBALI");
//
//        Theater inoxTheater = new Theater();
//        inoxTheater.setId(1);
//        inoxTheater.setScreen(createScreen());
//        inoxTheater.setCity(City.MUMBAI);
//        List<Show> inoxShows = new ArrayList<Show>();
//        Show inoxMorningShow = createShows(1, inoxTheater.getScreen().get(0), avengerMovie, 8);
//        Show inoxEveningShow = createShows(2, inoxTheater.getScreen().get(0), bahubali, 16);
//        inoxShows.add(inoxMorningShow);
//        inoxShows.add(inoxEveningShow);
//        inoxTheater.setShows(inoxShows);
//
//        Theater pvr = new Theater();
//        pvr.setId(2);
//
//
//    }
//
//    public static void main(String[] args) {
//        BookMyShow bookMyShow = new BookMyShow();
//        bookMyShow.initialize();
//
//        bookMyShow.createBooking(City.MUMBAI, "BAHUBALI");
//        bookMyShow.createBooking(City.MUMBAI, "BAHUBALI");
//    }
//}
