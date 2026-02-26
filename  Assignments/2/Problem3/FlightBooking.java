package Problem3;

public record FlightBooking(String origin, String destination, double distanceKm) {

    public double computeFlightTime(int avgSpeed) {
        return distanceKm / avgSpeed;
    }
}
