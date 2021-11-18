package Aula3_3.Aula3_3.app;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Quote")
public class Quote implements Serializable {

	@JoinColumn(name = "movie_id", referencedColumnName = "movieId")
	@JsonIgnoreProperties("quotes")
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Movie movie;
	@Column(name = "id")
	private Integer id;
	@Column(name = "quote")
	private String quote;

	public Quote(Integer id, String quote, Movie m) {
		this.id = id;
		this.quote = quote;
		movie = m;
	}

	public Quote() {

	}

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	@Override
	public String toString() {
		return "Quote [id=" + id + ", quote=" + quote + "]";
	}
	
}	