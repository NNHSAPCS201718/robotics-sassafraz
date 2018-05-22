import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;

public class Light {
    public static void main(String[] args) throws Exception {
        LightSensor light = new LightSensor(SensorPort.S1);
        boolean b = true;
        while (b) {
            LCD.drawInt(light.getLightValue(), 4, 0, 0);
            LCD.drawInt(light.getNormalizedLightValue(), 4, 0, 1);
            LCD.drawInt(SensorPort.S1.readRawValue(), 4, 0, 2);
            LCD.drawInt(SensorPort.S1.readValue(), 4, 0, 3);
            b = false;
        }
    }
}