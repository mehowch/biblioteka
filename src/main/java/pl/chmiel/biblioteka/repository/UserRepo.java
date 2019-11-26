package pl.chmiel.biblioteka.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.chmiel.biblioteka.component.Book;
import pl.chmiel.biblioteka.component.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    User findByUserName(String username);

    @Query("SELECT a FROM Book a WHERE a.title = :param OR a.author = :param OR a.year = :param")
    Iterable<Book> findBook(@Param("param") String param);
}
