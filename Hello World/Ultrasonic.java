
/**
 * Write a description of class Ultrasonic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.*;
import lejos.util.Delay;
import lejos.nxt.SensorPort;
import lejos.robotics.objectdetection.*;
public class Ultrasonic
{
    public static void main(String[] args) throws Exception {
        UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S1);
        FeatureDetector fd = new RangeFeatureDetector(sonic, 50, 500);
        sonic.continuous();
        while (!Button.ESCAPE.isDown()) {
            LCD.clear();
            LCD.drawString(sonic.getVendorID(), 0, 0);
            LCD.drawString(sonic.getProductID(), 0, 1);
            LCD.drawString(sonic.getVersion(), 0, 2);
            //sonic.ping();
            //Delay.msDelay(20);
            Feature result = fd.scan();
            if(result != null)
            {
                LCD.drawString(""+result.getRangeReading().getRange(), 0, 3);
            }
            Delay.msDelay(1000);
        }
    }
}

