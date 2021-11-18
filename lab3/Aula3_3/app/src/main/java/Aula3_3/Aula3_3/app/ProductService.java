package Aula3_3.Aula3_3.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private MovieRepository repository;
    @Autowired
    private QuoteRepository quotes;

    public Movie saveMovie(Movie product) {
        product.getQuotes().forEach( ( Quote q ) -> {
            quotes.save(q);
          } );
        return repository.save(product);
    }

    public List<Movie> saveMovies(List<Movie> products) {
        return repository.saveAll(products);
    }

    public List<Movie> getMovies() {
        return repository.findAll();
    }

    public Movie getMovieById(int id) {
        return (repository.findById(id) != null) ? repository.findById(id): new Movie();
    }

    public Quote saveQuote(Quote product) {
        repository.save(product.getMovie());
        return quotes.save(product);
    }

    public List<Quote> saveQuotes(List<Quote> products) {
        return quotes.saveAll(products);
    }

    public List<Quote> getQuotes() {
        return quotes.findAll();
    }

    public Quote getQuoteById(int id) {
        return (quotes.findQuoteById(id) != null) ? quotes.findQuoteById(id): null;
    }

    public void addQuotetoMovie(Quote qt, Movie mv) {
        if (mv != null && qt != null)
            mv.addQuote(qt);
    }
}