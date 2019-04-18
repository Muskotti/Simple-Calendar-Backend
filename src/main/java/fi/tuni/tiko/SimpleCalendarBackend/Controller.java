package fi.tuni.tiko.SimpleCalendarBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

@RestController
public class Controller {

    @Autowired
    EventRepository eventRepository;

    @GetMapping("/db")
    public Iterable<SimpleEvent> getEvents() {
        return eventRepository.findAll();
    }
}
