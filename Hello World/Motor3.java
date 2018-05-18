
/**
 * Write a description of class Motor2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.*;
import lejos.util.Delay;
public class Motor3
{
    public static void main(String[] args)
    {
        LCD.drawString("Program 3",0,0);
        Motor.B.rotate(1440);
        LCD.drawInt(Motor.B.getTachoCount(),0,1);
        Motor.B.rotateTo(0);
        LCD.drawInt(Motor.B.getTachoCount(),0,2);
        Button.waitForAnyPress();
    }
}
