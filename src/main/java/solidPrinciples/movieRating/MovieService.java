package solidPrinciples.movieRating;

public interface MovieService {
    void addMovie(Movie movie);
    Movie findMovieById(String movieId);
}
