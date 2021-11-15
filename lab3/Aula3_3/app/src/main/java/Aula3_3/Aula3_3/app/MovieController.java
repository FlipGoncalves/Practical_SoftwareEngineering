package Aula3_3.Aula3_3.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/")
public class MovieController {

    private MovieRepository movies;

	@GetMapping("/api/quotes")
	public Movie quote_movie(@RequestParam(value = "show", defaultValue = "1") int id) {
		return movies.findById(id);
	}

    @GetMapping("/api/shows")
	public List<Movie> shows() {
		return movies.findAll();
	}

    @GetMapping("/api/quote")
	public Movie quote() {
        List<Movie> mv = movies.findAll();
		return movies.findById(new Random().nextInt(mv.size()-1));
    }
}