package systemdesign.movieticketbooking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheaterController {
    Map<City, List<Theater>> cityVsTheaters;
    List<Theater> allTheaters;

    TheaterController() {
        cityVsTheaters = new HashMap<City, List<Theater>>();
        allTheaters = new ArrayList<Theater>();
    }

    void addTheater(Theater theater, City city) {
        allTheaters.add(theater);
        List<Theater> theaters = cityVsTheaters.getOrDefault(city, new ArrayList<>());
        theaters.add(theater);
        cityVsTheaters.put(city, theaters);
    }

    Map<Theater, List<Show>> getAllShow(Movie movie, City city) {
        Map<Theater, List<Show>> theaterVsShows = new HashMap<>();
        List<Theater> theaters = cityVsTheaters.get(city);

        for (Theater theater : theaters) {

        }
    }
}
