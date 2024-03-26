package learning.springframework.ch02.bootstrap;

import learning.springframework.ch02.domain.Author;
import learning.springframework.ch02.domain.Book;
import learning.springframework.ch02.repository.AuthorRepository;
import learning.springframework.ch02.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private  final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BootstrapData(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    /**
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("32523423");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);


        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setIsbn("345234244534");
        noEJB.setTitle("J2EE Development without EJB");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);

        System.out.println("In BootStrap");
        System.out.println("Author Count: "+ authorRepository.count());
        System.out.println("Book Count: "+ bookRepository.count());
    }
}
