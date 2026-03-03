package Problem4;

public class Refrigerator extends Appliance {
    private int temperature;

    public Refrigerator(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void performFunction() {
        System.out.println("Cooling items at temperature: " + temperature + "°C.");
    }
}
