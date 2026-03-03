package Problem2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor {
    int lightLevel;
    Locations location;

    LightSensor(int lightLevel, Locations locations) {
        if (lightLevel < 0) {
            throw new IllegalArgumentException("Light level cannot be negative");
        }

        this.location = locations;
        this.lightLevel = lightLevel;
    }

    @Override
    public String getSensorType() {
        return "Light"; // this.getClass().getSimpleName();
    }

    @Override
    public double getReading() {
        return lightLevel;
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
        if (lightLevel < 100) {
            return "an alert to turn on the ligh";
        }
        return "Light is sufficient";
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
