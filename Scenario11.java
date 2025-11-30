import java.util.Scanner;

/**
 * Write a description of class Scenario11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scenario11
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual income (NPR): ");
        double income = sc.nextDouble();
           double tax = 0;                                                                                                                                           
            if (income <= 500000) {
                tax = income * 0.01;

        } else if (income <= 700000) {
            tax = 500000 * 0.01 + (income - 500000) * 0.10;

        } else if (income <= 1000000) {
            tax = 500000 * 0.01+ 200000 * 0.10 + (income - 700000) * 0.20;
            if (income <= 2000000) {
            tax = 500000 * 0.01
                    + 200000 * 0.10
                    + 300000 * 0.20
                    + (income - 1000000) * 0.30;

        } else if (income <= 5000000) {
            tax = 500000 * 0.01 + 200000 * 0.10+ 300000 * 0.20+ 1000000 * 0.30+ (income - 2000000) * 0.36;
             } else {
            tax = 500000 * 0.01+ 200000 * 0.10 + 300000 * 0.20+ 1000000 * 0.30+ 3000000 * 0.36+ (income - 5000000) * 0.39;
        }
        System.out.println("Total Tax Payable: NPR " + tax);
    }
}
 }

  
