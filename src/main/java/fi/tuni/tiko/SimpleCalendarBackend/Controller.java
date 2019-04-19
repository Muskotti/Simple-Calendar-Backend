package fi.tuni.tiko.SimpleCalendarBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    EventRepository eventRepository;

    @GetMapping("/db/{date}")
    public Iterable<SimpleEvent> getEvents(@PathVariable String date) {
        return eventRepository.findAllByDate(date);
    }

    @RequestMapping(value="/db/addEvent", method= RequestMethod.POST)
    @ResponseBody
    public Optional<SimpleEvent> addEvent(@RequestBody SimpleEvent se) {
        eventRepository.save(se);
        return Optional.of(se);
    }
}
