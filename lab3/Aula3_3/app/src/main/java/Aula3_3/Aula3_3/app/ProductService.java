package Aula3_3.Aula3_3.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    MovieRepository repository;
    @Autowired
    QuoteRepository quotes;

    public Movie saveMovie(Movie product) {
        product.getQuotes().forEach( ( Quote q ) -> {
            q.setMovie(product);
            product.addQuote(q);
            quotes.save(q);
          } );
        repository.save(product);
        return product;
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
        quotes.save(product);
        return product;
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