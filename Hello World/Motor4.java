
/**
 * Write a description of class Motor4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.*;
import lejos.util.Delay;
public class Motor4
{
    public static void main(String[] args)
    {
        LCD.drawString("Program 4",0,0);
        Motor.B.rotate(-1440,true);
        while(Motor.B.isMoving())
        {
            LCD.drawInt(Motor.B.getTachoCount(),0,1);
        }
        Button.waitForAnyPress();
        Motor.B.stop();
        LCD.drawInt(Motor.B.getTachoCount(),0,2);
        Button.waitForAnyPress();
    }
}
