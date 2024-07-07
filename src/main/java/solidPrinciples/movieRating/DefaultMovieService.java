package solidPrinciples.movieRating;

import java.util.HashMap;
import java.util.Map;

public class DefaultMovieService implements MovieService {
    private final Map<String, Movie> movies = new HashMap<>();

    @Override
    public void addMovie(Movie movie){
        movies.put(movie.getId(), movie);
    }

    @Override
    public Movie findMovieById(String movieId) {
        return movies.get(movieId);
    }
}
