
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
            penUp();
            pilot.travel(-8.5);
            pilot.rotate(107);
            pilot.travel(8.5);
            penDown();
        }
    }
    public void printHi()
    {
        Delay.msDelay(1000);
        pilot.travel(6);
        penUp();
        pilot.rotate(214);
        penDown();
        pilot.travel(3);
        penUp();
        pilot.rotate(107);
        penDown();
        pilot.travel(3);
        penUp();
        pilot.rotate(107);
        penDown();
        pilot.travel(3);
        penUp();
        pilot.rotate(214);
        penDown();
        pilot.travel(6);
        penUp();
        pilot.rotate(107); 
        penDown();
        pilot.travel(2);
        penUp();
        pilot.rotate(107);
        penDown();
        pilot.travel(3);
        penUp();
        pilot.rotate(214);
        penDown();
        pilot.travel(3);
        penUp();
        pilot.rotate(107);
        penDown();
        pilot.travel(2);
    }
    public static void penUp()
    {
        Motor.A.rotateTo(90);
    }
    public static void penDown()
    {
        Motor.A.rotateTo(0);
    }
    public static void main(String[] args)
    {
        SquareTracer s=new SquareTracer();
        s.pilot=new DifferentialPilot(2.25f,5.5f,Motor.B,Motor.C);
        s.drawSquare(3);
    }
}
