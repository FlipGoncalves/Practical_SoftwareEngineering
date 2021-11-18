package Aula3_3.Aula3_3.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends JpaRepository<Quote, Integer>{
    public Movie findById(int id);
    public Quote findQuoteById(int id);
}
