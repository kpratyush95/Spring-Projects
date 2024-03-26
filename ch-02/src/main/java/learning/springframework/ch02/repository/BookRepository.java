package learning.springframework.ch02.repository;

import learning.springframework.ch02.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
