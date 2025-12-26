package main7;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args) {

        
        bankac acc1=new bankac(001,"subu",10000);
        bankac acc2=new bankac(002,"oshin",20000);
        
        
        


        acc1.deposit(2000);
        acc1.withdraw(1500);

        acc2.deposit(1000);
        acc2.withdraw(500);

        
        acc1.displayBalance();
        acc2.displayBalance();
    
    }
}

