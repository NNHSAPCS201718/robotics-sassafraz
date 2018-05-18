
/**
 * Write a description of class Motor5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import lejos.nxt.*;
import lejos.util.Delay;
public class Motor5
{
    public static void main(String[] args)
    {
        LCD.drawString("Program 5",0,0);
        Motor.B.setSpeed(720);
        Motor.C.setSpeed(720);
        Motor.B.forward();
        Motor.C.forward();
        for(int i=0;i<8;i++)
        {
            Delay.msDelay(200);
            LCD.drawInt(Motor.B.getTachoCount(),0,i+1);
            LCD.drawInt(Motor.C.getTachoCount(),5,i+1);
        }
        Motor.B.stop();
        Motor.C.stop();
        Button.waitForAnyPress();
    }
}
