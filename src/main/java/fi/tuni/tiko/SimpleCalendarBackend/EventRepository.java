package fi.tuni.tiko.SimpleCalendarBackend;

import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<SimpleEvent, Long> {
    Iterable<SimpleEvent> findAllByDate(String date);
}
