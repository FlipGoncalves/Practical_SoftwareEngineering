package Aula3_3.Aula3_3.app;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Movie")
public class Movie {

	private Integer id;
    private String title;
	@OneToMany(targetEntity = Quote.class,fetch = FetchType.EAGER, mappedBy = "movie", cascade = CascadeType.ALL)
	private Set<Quote> quotes;

	public Movie(Integer id, String titlet) {
		this.id = id;
        this.title = title;
	}

	public Movie() {
	}

	@OneToMany(targetEntity = Quote.class,fetch = FetchType.EAGER, mappedBy = "movie", cascade = CascadeType.ALL)
	public Set<Quote> getQuotes() {
		return quotes;
	}

	public void setQuotes(Set<Quote> quotes) {
		this.quotes = quotes;
	}

	@Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "title", nullable = false)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", quotes="+ this.quotes +"]";
	}

	public void addQuote(Quote qt) {
		if (qt != null)
			quotes.add(qt);
	}

}	