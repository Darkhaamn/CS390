package Problem2;

public class SensorTest {
    void main() {
        LightSensor light = new LightSensor(10, Locations.BEDROOM);
        SoundSensor sound = new SoundSensor(10, Locations.GARDEN);
        TemparatureSensor temp = new TemparatureSensor(21, Locations.Kitchen);
        LightSensor lightHigh = new LightSensor(150, Locations.LIVING_ROOM);
        TemparatureSensor tempHigh = new TemparatureSensor(35, Locations.GARDEN);

        Sensor[] sensors = {light, sound, temp, lightHigh,tempHigh};
        for (Sensor o: sensors) {
            System.out.println(o);
            System.out.println();
        }
    }
}
