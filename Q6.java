
/**
 * Write a description of class Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q6
{
    public static void main(String[]arg)
    {
        double Waterlevel=950;
        System.out.println("Current Water Level:"+ Waterlevel);
        String message=(Waterlevel>=1000)?"Water Level has reached 1000L or more!":"Status:Normal";
        System.out.println(message);
    }
}