package learning.springframework.ch02.bootstrap;

import learning.springframework.ch02.domain.Author;
import learning.springframework.ch02.domain.Book;
import learning.springframework.ch02.domain.Publisher;
import learning.springframework.ch02.repository.AuthorRepository;
import learning.springframework.ch02.repository.BookRepository;
import learning.springframework.ch02.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private  final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    private final PublisherRepository publisherRepository;

    public BootstrapData(BookRepository bookRepository, AuthorRepository authorRepository, PublisherRepository publisherRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.publisherRepository = publisherRepository;
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


        Publisher oRiley = new Publisher();
        oRiley.setPublisherName("ORiley");
        oRiley.setAddress("124 fake lane");
        oRiley.setCity("fake city");
        oRiley.setState("fake State");
        oRiley.setZip("52342");

        Publisher oRileySaved =  publisherRepository.save(oRiley);
        dddSaved.setPublisher(oRileySaved);
        noEJBSaved.setPublisher(oRileySaved);

        bookRepository.save(dddSaved);
        bookRepository.save(noEJBSaved);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);

        System.out.println("In BootStrap");
        System.out.println("Author Count: "+ authorRepository.count());
        System.out.println("Book Count: "+ bookRepository.count());
        System.out.println("Publisher Count: "+ publisherRepository.count());
    }
}
