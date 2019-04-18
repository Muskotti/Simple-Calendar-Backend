package fi.tuni.tiko.SimpleCalendarBackend;

import javax.persistence.*;

@Entity
@Table(name="simple_events")
public class SimpleEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String eventName;

    private String eventText;

    public SimpleEvent(){}

    public SimpleEvent( String eventName, String eventText) {
        this.eventName = eventName;
        this.eventText = eventText;
    }

    public Long getEventId() {
        return id;
    }

    public void setEventId(Long eventId) {
        this.id = eventId;
    }

    public String getMakerName() {
        return eventName;
    }

    public void setMakerName(String makerName) {
        this.eventName = makerName;
    }

    public String getEventText() {
        return eventText;
    }

    public void setEventText(String eventText) {
        this.eventText = eventText;
    }

    @Override
    public String toString() {
        return "eventItem{" +
                "eventId=" + id +
                ", eventName='" + eventName + '\'' +
                ", eventText='" + eventText + '\'' +
                '}';
    }
}
