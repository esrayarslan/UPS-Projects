public class Movie {
    private final Long movieId;
    private final String movieTitle;
    private final String director;
    private final String cast;
    private final String movieDate;
    private final String description;
    private final String type;

    public Movie(Long movieId, String movieTitle, String director, String cast, String movieDate, String description, String type) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.director = director;
        this.cast = cast;
        this.movieDate = movieDate;
        this.description = description;
        this.type = type;

    }

    public Long getMovieId() {
        return movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getDirector() {
        return director;
    }

    public String getCast() {
        return cast;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public String getDescription() {
        return description;
    }

    public String getKind() {
        return type;
    }


    @Override
    public String toString() {
        return "*" + this.getClass().getName() +
                "Movie{" +
                "movieId=" + movieId +
                ", movieTitle='" + movieTitle + '\'' +
                ", director='" + director + '\'' +
                ", cast='" + cast + '\'' +
                ", movieDate=" + movieDate +
                ", description='" + description + '\'' +
                ", kind='" + type + '\'' +
                '}';
    }
}


