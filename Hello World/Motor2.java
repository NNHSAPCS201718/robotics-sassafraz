
/**
 * Write a description of class Motor2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.*;
import lejos.util.Delay;
public class Motor2
{
    public static void main(String[] args)
    {
        LCD.drawString("Program 2", 0,0);
        Motor.B.setSpeed(2020);
        Motor.B.forward();
        Delay.msDelay(10000);
        LCD.drawString(Motor.B.getTachoCount()+"",0,1);
        Motor.B.stop();
        LCD.drawString(Motor.B.getTachoCount()+"",0,2);
        Motor.B.backward();
        while(Motor.B.getTachoCount() > 0)
        {
            continue;
        }
        LCD.drawString(Motor.B.getTachoCount()+"",0,3);
        Motor.B.stop();
        LCD.drawString(Motor.B.getTachoCount()+"",0,4);
        Button.waitForAnyPress();
        
    }
}
