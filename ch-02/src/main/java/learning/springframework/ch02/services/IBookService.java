package learning.springframework.ch02.services;

import learning.springframework.ch02.domain.Book;

public interface IBookService {
    Iterable<Book> findAll();
}
