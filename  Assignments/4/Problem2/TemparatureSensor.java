package Problem2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TemparatureSensor implements Sensor {
    double temperature;
    Locations location;

    TemparatureSensor(double temperature, Locations location) {
        this.temperature = temperature;
        this.location = location;
    }

    @Override
    public String getSensorType() {
        return "Temperature"; // this.getClass().getSimpleName();
    }

    @Override
    public double getReading() {
        return temperature;
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
        if (temperature >= 18 && temperature < 30) {
            return "an alert to turn on the AC";
        }

        if (temperature < 18 ) {
            return "an alert to turn on the Heater otherwise";
        }

        return "Temperature is in normal range";
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
