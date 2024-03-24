package learning.springframework.ch02.repositories;

import learning.springframework.ch02.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
