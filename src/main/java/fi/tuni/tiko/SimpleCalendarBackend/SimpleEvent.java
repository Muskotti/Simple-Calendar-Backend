package fi.tuni.tiko.SimpleCalendarBackend;

public class SimpleEvent {

    private int eventId;
    private String eventName;
    private String eventText;

    public SimpleEvent(int eventId, String eventName, String eventText) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventText = eventText;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
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
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", eventText='" + eventText + '\'' +
                '}';
    }
}
