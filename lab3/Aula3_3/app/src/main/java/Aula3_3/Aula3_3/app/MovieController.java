package Aula3_3.Aula3_3.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Random;

import javax.validation.Valid;      

@RestController
@RequestMapping("/")
public class MovieController {

    @Autowired
    private ProductService service;

	@GetMapping("api/quotes")
	public Movie quote_movie(@RequestParam(value = "show", defaultValue = "World") int id) {
		return service.getMovieById(id);
	}   

	@PostMapping("/addshow")
    public Movie addShow(@Valid @RequestBody Movie movie){
        return service.saveMovie(movie);
    }

	@PostMapping("/addquote")
    public Quote addQuote(@Valid @RequestBody Quote quote){
        return service.saveQuote(quote);
    }

    @GetMapping("api/shows")
	public List<Movie> shows() {
        service.getMovies().forEach((Movie m) -> {System.out.println(m);});
		return service.getMovies();
	}

    @GetMapping("api/allquotes")
	public List<Quote> quotes() {
		return service.getQuotes();
	}

    @GetMapping("api/quote")
	public Movie quote() {
        List<Movie> mv = service.getMovies();
		return service.getMovieById(new Random().nextInt(mv.size())+1);
    }
}	