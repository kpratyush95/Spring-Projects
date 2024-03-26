package learning.springframework.ch02.repository;

import learning.springframework.ch02.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
