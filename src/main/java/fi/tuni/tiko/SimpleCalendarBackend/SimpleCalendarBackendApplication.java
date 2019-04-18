package fi.tuni.tiko.SimpleCalendarBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.util.Date;

@SpringBootApplication
public class SimpleCalendarBackendApplication implements CommandLineRunner {

    @Autowired
    EventRepository events;

    public static void main(String[] args) {
        SpringApplication.run(SimpleCalendarBackendApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        SimpleEvent event1 = new SimpleEvent("Event1", "Event1 text","18-04-2019");
        events.save(event1);
    }
}
