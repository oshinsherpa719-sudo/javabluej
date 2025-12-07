import java.util.Scanner;

/**
 * Write a description of class FixedDepositNB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FixedDepositNB {

    public class FixedDepositNIB {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        final double FEE_RATE = 0.005; 
        boolean run = true;

        System.out.println("=== Nepal Investment Bank Fixed Deposit Calculator ===");

        while (run) {

            System.out.print("\nEnter Principal Amount (min Rs.1000): ");
            double P = sc.nextDouble();
            if (P == 0) {
                System.out.println("Program Ended.");
                break;
            }

            if (P < 1000) {
                System.out.println("Amount must be at least Rs.1000.");
                continue;
            }

            System.out.print("Enter Annual Interest Rate (8 - 12 %): ");
            double annualRate = sc.nextDouble();

            
            while (annualRate < 8 || annualRate > 12) {
                System.out.print("Invalid rate! Enter rate between 8 and 12: ");
                annualRate = sc.nextDouble();
            }
            System.out.print("Enter Duration in Years (max 5): ");
            int years = sc.nextInt();

            
            while (years <= 0 || years > 5) {
                System.out.print("Invalid years! Enter years (1 - 5): ");
                years = sc.nextInt();
            }

            int months = years * 12;
            double monthlyRate = (annualRate / 100) / 12;

            
            double A = P * Math.pow(1 + monthlyRate, months);

            double fee = A * FEE_RATE;
            double finalAmount = A - fee;

            System.out.println("\n------ RESULT ------");
            System.out.println("Principal (P): Rs. " + P);
            System.out.println("Annual Rate: " + annualRate + "%");
            System.out.println("Monthly Rate: " + monthlyRate);
            System.out.println("Time: " + months + " months");
            System.out.println("Maturity Amount (before fee): Rs. " + A);
            System.out.println("Processing Fee (0.5%): Rs. " + fee);
            System.out.println("Final Amount Received: Rs. " + finalAmount);

            
            System.out.print("\nDo you want to calculate another FD? (y/n): ");
            char choice = sc.next().charAt(0);

            while (choice != 'y' && choice != 'Y' && choice != 'n' && choice != 'N') {
                System.out.print("Enter only y or n: ");
                choice = sc.next().charAt(0);
            }

            if (choice == 'n' || choice == 'N') {
                run = false;
                System.out.println("Thank you!");
            }
        }

    }
}
}