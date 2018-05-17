
import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;

/**
 * Simplest 3 motor commands
 * @author owner.GLASSEY
 *
 */
public class MotorTutor1
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        LCD.drawString("Program 1", 0, 0);
        Button.waitForAnyPress();
        LCD.clear();
        Motor.B.forward();
        LCD.drawString("FORWARD",0,0);
        Button.waitForAnyPress();
        LCD.drawString("BACKWARD",0,0);
        Motor.B.backward();
        Button.waitForAnyPress();
        Motor.B.stop();     
    }
}

