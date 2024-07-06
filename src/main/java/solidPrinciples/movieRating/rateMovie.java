package solidPrinciples.movieRating;

public interface rateMovie {
    void rateMovie(String userId, String movieId, int rating);
    double getAverageRating(String movieId);
}
