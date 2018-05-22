
/**
 * Write a description of class Touch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.LCD;
import lejos.nxt.*;
import lejos.util.Delay;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.Sound;
import lejos.robotics.navigation.DifferentialPilot;

public class Touch {
    public static void main(String[] args) throws Exception {
        TouchSensor touch = new TouchSensor(SensorPort.S2);

        while (!touch.isPressed()) {
            // try again
        }
        Sound.beep();
        Sound.buzz();
        Delay.msDelay(1000);
        LCD.drawString("Finished", 3, 4);

        Button.waitForAnyPress();
    }
}