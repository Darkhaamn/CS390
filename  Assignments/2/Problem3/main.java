package Problem3;

import java.util.Scanner;

public class main {
    void main() {
        System.out.println("------------------------------------------");
        System.out.println("Problem 3: Immutable & Record class");
        System.out.println("------------------------------------------");

        Scanner inp = new Scanner(System.in);
        String again;

        do {
            System.out.println("""
                    Enter F for Flight Booking
                    Enter H for Hotel Booking
                    Enter C for Car Rental""");
            System.out.print("Choose: ");

            String choose = inp.nextLine();
            switch (choose) {
                case "F" -> {
                    System.out.print("Enter origin:");
                    String origin = inp.nextLine();

                    System.out.print("Enter destination:");
                    String destination = inp.nextLine();

                    System.out.print("Enter distance in km:");
                    int distanceKm = inp.nextInt();

                    System.out.print("Enter average speed (km/h):");
                    int speedKmh = inp.nextInt();

                    FlightBooking flightBook = new FlightBooking(origin, destination, distanceKm);
                    System.out.printf("Estimated Flight Time: %.2f hours", flightBook.computeFlightTime(speedKmh));
                }
                case "H" -> {
                    System.out.print("Enter hotel name:");
                    String hotel = inp.nextLine();

                    System.out.print("Enter number of nights:");
                    int nights = inp.nextInt();

                    System.out.print("Enter price per night:");
                    int pricePerNight = inp.nextInt();

                    HotelBooking hotelBooking = new HotelBooking(hotel, nights, pricePerNight);

                    System.out.printf("Total Hotel Cost: %.2f", hotelBooking.totalCost());
                }
                case "C" -> {
                    System.out.print("Enter car model:");
                    String model = inp.nextLine();

                    System.out.print("Enter number of days:");
                    int days = inp.nextInt();

                    System.out.print("Enter rate per day:");
                    int ratePerDay = inp.nextInt();

                    System.out.print("Enter miles per day:");
                    int milesPerDay = inp.nextInt();

                    CarRental carRental = new CarRental(model, days, ratePerDay, milesPerDay);

                    System.out.printf("Total Rental Cost: %.2f", carRental.totalRentalCost());
                    System.out.printf("\nTotal Miles Allowed: %.2f", carRental.totalMilesAllowed());
                }
                default -> System.out.println("Invalid input.");
            }
            inp.nextLine();

            System.out.print("\nDo you want to continue (y/n): ");
            again = inp.nextLine().toLowerCase();
        } while (again.equals("y"));

        System.out.println("Goodbye!");
        inp.close();
    }
}
