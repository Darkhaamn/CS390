package Problem2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor {
    int soundlevel;
    Locations location;

    SoundSensor(int soundlevel, Locations location) {
        if (soundlevel < 0) {
            throw new IllegalArgumentException("Sound level cannot be negative");
        }

        this.soundlevel = soundlevel;
        this.location = location;
    }

    @Override
    public String getSensorType() {
        return "Sound"; // this.getClass().getSimpleName();
    }

    @Override
    public double getReading() {
        return soundlevel;
    }

    @Override
    public Locations getLocation() {
        return location;
    }

    @Override
    public LocalDateTime getLastUpdated() {
        return LocalDateTime.now();
    }

    @Override
    public String performAction() {
        if (soundlevel < 70) {
            return "an alert to turn on noise cancellation";
        }
        return "Sound is within normal range";
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");

        return "Sensor Type: " + getSensorType() +
                "\nReading: " + getReading() +
                "\nLocation: " + getLocation() +
                "\nLast Updated: " + getLastUpdated().format(formatter) +
                "\nAction: " + performAction();
    }
}
