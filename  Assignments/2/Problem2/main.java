package Problem2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.DateTimeException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Problem 2:");
        System.out.println("------------------------------------------");

        Scanner inp = new Scanner(System.in);

        System.out.print("Please Enter your event name: ");
        String eventName = inp.nextLine().trim();

        DateTimeFormatter dateFmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate ld;
        while (true) {
            System.out.print("Please Enter your event date (YYYY/MM/DD): ");
            String eventDate = inp.nextLine().trim();
            try {
                ld = LocalDate.parse(eventDate, dateFmt);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date. Please use format YYYY/MM/DD (example: 2026/10/22).");
            }
        }

        DateTimeFormatter timeFmt = DateTimeFormatter.ofPattern("H:mm");
        LocalTime lt;
        while (true) {
            System.out.print("Please Enter your event time (H:mm): ");
            String eventTime = inp.nextLine().trim();
            try {
                lt = LocalTime.parse(eventTime, timeFmt);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid time. Please use format H:mm (example: 10:33 or 0:05).");
            }
        }

        Event e1 = new Event(eventName, ld, lt);
        System.out.println("\n--- Event Info ---");
//        e1.formatDate();

        System.out.println("Event: " + e1.getName());
        System.out.println("Day of Week: " + e1.dayOfWeek().toString());
        System.out.println("Leap Year?: " + (e1.isLeapYear() ? "Yes" : "No"));

        long days = e1.daysUntil();
        if (days > 0) {
            System.out.println("Days until event: " + days);
        } else if (days == 0) {
            System.out.println("Days until event: Today!");
        } else {
            System.out.println("Days until event: Event already passed (" + days + ")");
        }
        System.out.println("\nFormatted (System Zone):");
        System.out.println(e1.formatFull());

        String timezone;
        while (true) {
            System.out.print("Do you want convert other timezone (e.g., America/Panama)? ");
            timezone = inp.nextLine().trim();
            try {
                ZoneId.of(timezone); // just validate
                break;
            } catch (DateTimeException e) {
                System.out.println("Invalid timezone. Example: America/Panama, America/Chicago");
            }
        }

        System.out.println(e1.convertTimezone(timezone));
    }
}