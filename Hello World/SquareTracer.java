
/**
 * Write a description of class SquareTracer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.*;
import lejos.util.Delay;
import lejos.robotics.navigation.DifferentialPilot;
public class SquareTracer
{
    DifferentialPilot pilot;
    
    public void drawSquare(int length)
    {
        Delay.msDelay(2000);
        for(int i=0;i<4;i++)
        {
            pilot.travel(length);
            pilot.rotate(90);
        }
    }
    public static void main(String[] args)
    {
        SquareTracer s=new SquareTracer();
        s.pilot=new DifferentialPilot(2.25f,5.5f,Motor.B,Motor.C);
        s.drawSquare(3);
    }
}
