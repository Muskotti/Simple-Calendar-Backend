package fi.tuni.tiko.SimpleCalendarBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        String newDate = dateFormat.format(cal.getTime());
        SimpleEvent event1 = new SimpleEvent("Event1", "Event1 text",newDate);
        events.save(event1);
    }
}
