package solidPrinciples.movieRating;

public interface RatingService {
    void rateMovie(String userId, String movieId, int rating);
    double getAverageRating(String movieId);
}
