package movies.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import movies.Entity.*;
import movies.Service.MovieDBServiceMid;

public class MovieDBControllerMid {
	 @Autowired
	 	MovieDBServiceMid middleManMovieDBService;
	    @GetMapping("api/genre/movie/list")
	    public List<Genres> getAllGenres() throws IOException {

	        return MovieDBServiceMid.findAllGenreMovieList();
	    }
	    @GetMapping("api/movie/popular")
	    public List<Movie> getPopularMovies() throws IOException {
	        return MovieDBServiceMid.findPopularMovies();
	    }
	    @GetMapping("api/movie/top_rated")
	    public List<Movie> getTopRatedMovies() throws IOException {
	        return MovieDBServiceMid.findPopularMovies();
	    }
	    @GetMapping("api/movie/{movie_id}")
	    public Movie getMoviesById(@PathVariable Integer movie_id) throws IOException {
	        return MovieDBServiceMid.findMovieById(movie_id);
	    }
	    @GetMapping("api/movie/{movie_id}/credits")
	    public List<CastAndCrew> getCastAndCrewMovieById(@PathVariable Integer movie_id) throws IOException {
	        return MovieDBServiceMid.findCastAndCrewMovieById(movie_id);
	    }
	    @GetMapping("api/movie/{movie_id}/images")
	    public List<Image> getImagesForMovieById(@PathVariable Integer movie_id) throws IOException {
	        return MovieDBServiceMid.findAllImagesForMovieById(movie_id);
	    }
}
