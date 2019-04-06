package fi.tuni.tiko.SimpleCalendarBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleCalendarBackendApplication implements CommandLineRunner {

    @Autowired
    EventRepository eventRepository;

    public static void main(String[] args) {
        SpringApplication.run(SimpleCalendarBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SimpleEvent event = new SimpleEvent("asd","asd");
        eventRepository.save(event);
    }
}
