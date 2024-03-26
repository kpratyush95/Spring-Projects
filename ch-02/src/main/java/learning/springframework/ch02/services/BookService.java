package learning.springframework.ch02.services;

import learning.springframework.ch02.domain.Book;
import learning.springframework.ch02.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService{

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
