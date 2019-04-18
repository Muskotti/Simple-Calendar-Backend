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

    private String date;

    public SimpleEvent(){}

    public SimpleEvent( String eventName, String eventText, String date) {
        this.eventName = eventName;
        this.eventText = eventText;
        this.date = date;
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

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "eventItem{" +
                "eventId=" + id +
                ", eventName='" + eventName + '\'' +
                ", eventText='" + eventText + '\'' +
                ", date='" + this.date + '\'' +
                '}';
    }
}
