package Problem2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Event {
    private final String name;
    private final LocalDate date;
    private final LocalTime time;

    public Event(String name, LocalDate date, LocalTime time) {
        this.name = name;
        this.date = date;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String formatFull() {
        ZoneId systemZone = ZoneId.systemDefault();
        ZonedDateTime zdt = ZonedDateTime.of(date, time, systemZone);

        DateTimeFormatter fmt =
                DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy @ HH:mm '['VV']'");
        return zdt.format(fmt);
    }

    public String convertTimezone(String zoneIdText) {
        ZoneId systemZone = ZoneId.systemDefault();
        ZoneId targetZone = ZoneId.of(zoneIdText);

        ZonedDateTime systemZdt = ZonedDateTime.of(date, time, systemZone);
        ZonedDateTime targetZdt = systemZdt.withZoneSameInstant(targetZone);

        DateTimeFormatter fmt =
                DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy @ HH:mm '['VV']'");
        return targetZdt.format(fmt);
    }

    public DayOfWeek dayOfWeek() {
        return date.getDayOfWeek();
    }

    public boolean isLeapYear() {
        return date.isLeapYear();
    }

    public long daysUntil() {
        LocalDate today = LocalDate.now();
        return ChronoUnit.DAYS.between(today, date);
    }
}
