package solidPrinciples.movieRating;

public class Rating {
    private String userId;
    private String movieId;
    private String rating;

    public Rating(String userId, String movieId, String rating) {
        this.userId = userId;
        this.movieId = movieId;
        this.rating = rating;
    }
    public String getUserId() {
        return userId;
    }
    public String getMovieId() {
        return movieId;
    }
    public String getRating() {
        return rating;
    }
}
