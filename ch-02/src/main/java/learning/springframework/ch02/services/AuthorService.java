package learning.springframework.ch02.services;

import learning.springframework.ch02.domain.Author;
import learning.springframework.ch02.repository.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class AuthorService implements IAuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    /**
     * @return
     */
    @Override
    public Iterable<Author> findAll() {
       return authorRepository.findAll();
    }
}
