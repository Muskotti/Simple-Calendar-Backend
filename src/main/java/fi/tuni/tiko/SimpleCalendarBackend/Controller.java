package fi.tuni.tiko.SimpleCalendarBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    EventRepository eventRepository;


    @RequestMapping("/")
    @ResponseBody
    public String home() {
        String result = "Loading...";
        Iterable<SimpleEvent> eventIterable = eventRepository.findAll();
        result = eventIterable.toString();
        return result;
    }
}
