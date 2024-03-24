package learning.springframework.ch02.repositories;

import learning.springframework.ch02.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
