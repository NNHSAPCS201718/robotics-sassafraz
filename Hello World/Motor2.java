
/**
 * Write a description of class Motor2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.*;
public class Motor2
{
    public static void main(String[] args)
    {
        LCD.drawString("Program 2", 0,0);
        Motor.B.setSpeed(2);
        Motor.B.forward();
        
    }
}
