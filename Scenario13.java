import java.util.Scanner;
/**
 * Write a description of class Scenario13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scenario13
{
    public static void main(String[] args) {

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
            System.out.println("Invalid age group!");
            return;
        }

        
        if (language.equals("hindi")) {
            price += 50;
        } else if (language.equals("english")) {
            price += 100;
        } else if (language.equals("nepali")) {
            
        } else {
            System.out.println("Invalid movie language!");
            return;
        }

      
        if (isStudent.equals("yes")) {
            price = price - (price * 0.20);
        }

        
        if (isFestival.equals("yes")) {
            price = price - (price * 0.15);
        }

        
        System.out.println("Final Ticket Price: Rs. " + price);

        sc.close();
    }
}
