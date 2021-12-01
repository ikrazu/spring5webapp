package guru.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.PublisherRepository;

@Component
public class PublisherBoostrap implements CommandLineRunner {

    private final PublisherRepository publisherRepository;

    public PublisherBoostrap(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        
        Publisher pub1 = new Publisher("pub1", "Tolosa");
        Publisher pub2 = new Publisher("pub2", "Bilbo");

        this.publisherRepository.save(pub1);
        this.publisherRepository.save(pub2);

        System.out.println("Number of publishers: " + this.publisherRepository.count());
    }
    
}
