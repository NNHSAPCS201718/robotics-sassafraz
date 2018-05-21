
/**
 * Write a description of class SquareTracer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.*;
import lejos.util.Delay;
import lejos.robotics.navigation.DifferentialPilot;
public class Circle
{
    DifferentialPilot pilot;
    
    public void drawCircle(double r, double angle, boolean b)
    {
        pilot.arc(r,angle,b);
    }
    public static void main(String[] args)
    {
        Circle s=new Circle();
        s.pilot=new DifferentialPilot(2.25f,5.5f,Motor.B,Motor.C);
        s.drawCircle(10,720,false);
    }
}
