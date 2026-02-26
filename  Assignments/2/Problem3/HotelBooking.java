package Problem3;

public record HotelBooking(String hotelName,int nights, int pricePerNight) {
    public double totalCost() {
        return nights*pricePerNight;
    }
}
