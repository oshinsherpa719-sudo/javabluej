import java.util.Scanner;

/**
 * Write a description of class StudentInformation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentInformation
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter theb Student name");
        String name=sc. nextLine();
        System.out.println("Enter the age");
        int age=sc.nextInt();
        System.out.println("Enter the Student GPA");
        double GPA=sc.nextDouble();
        sc.close();
    }
}