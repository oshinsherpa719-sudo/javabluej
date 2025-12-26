package main7;


/**
 * Write a description of class bankac here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bankac
{
    
    int accountNumber;
    String holderName;
    double balance;

    
    public bankac(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    
    void deposit(double amount) {
        balance = balance + amount;
    }

    
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance for " + holderName);
        }
    }

    
    void displayBalance() {
        System.out.println("Account No: " + accountNumber);
        System.out.println (" Holder: " + holderName);
        System.out.println  (" Balance: " + balance);
        
    }
}
