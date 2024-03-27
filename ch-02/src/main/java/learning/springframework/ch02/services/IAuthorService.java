package learning.springframework.ch02.services;

import learning.springframework.ch02.domain.Author;

public interface IAuthorService {
    Iterable<Author> findAll();
}
