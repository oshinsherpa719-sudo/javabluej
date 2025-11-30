import java.util.Scanner;

/**
 * Write a description of class MovieTicketPrice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MovieTicketPrice
{


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter age group (child/adult/senior): ");
        String ageGroup = sc.next().toLowerCase();

        System.out.print("Enter movie language (nepali/hindi/english): ");
        String language = sc.next().toLowerCase();

        System.out.print("Are you a student? (yes/no): ");
        String isStudent = sc.next().toLowerCase();

        System.out.print("Is it a festival day? (yes/no): ");
        String isFestival = sc.next().toLowerCase();


      
        double price = 0;

        if (ageGroup.equals("child")) {
            price = 150;
        } else if (ageGroup.equals("adult")) {
            price = 250;
        } else if (ageGroup.equals("senior")) {
            price = 200;
        } else {

            
            
        }
    }
}
