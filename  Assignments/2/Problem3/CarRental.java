package Problem3;

final public class CarRental {
    private final String carModel;
    private final int days;
    private final int ratePerDay;
    private final int milesPerDay;

    public CarRental(String carModel, int days, int ratePerDay, int milesPerDay) {
        this.carModel = carModel;
        this.days = days;
        this.ratePerDay = ratePerDay;
        this.milesPerDay = milesPerDay;
    }

    // getters
    public String getCarModel() {
        return carModel;
    }
    public double totalRentalCost() {
        return days * ratePerDay;
    }
    public double totalMilesAllowed() {
        return days * milesPerDay;
    }
}