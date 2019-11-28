package pl.chmiel.biblioteka.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.chmiel.biblioteka.component.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Long> {


//    search by all 3 params does not work
//    @Query("SELECT a FROM Book a WHERE a.title = :param OR a.author = :param OR a.year = :param")
//    Iterable<Book> findBook(@Param("param") String param);


//    search by title or author works
@Query("SELECT a FROM Book a WHERE a.title = :param OR a.author = :param")
    Iterable<Book> findBook(@Param("param") String param);

}