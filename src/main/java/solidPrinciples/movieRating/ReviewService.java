package solidPrinciples.movieRating;

public interface ReviewService {
    void addReview(String userId, String movieId, String reviewText);
    Review getReview(String userId, String movieId);
}
