package week10;


/**
 * Write a description of class orderapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class orderapp
{
    
    public static void main(String[] Args)
    {
        NormalOrder N1 = new NormalOrder(001,"Aahanu",1299);
        System.out.println(N1);
        double N1_Amount = N1.calculateFinalAmount();
        System.out.println("Final Amount: " + N1_Amount);

        NormalOrder N2 = new NormalOrder(002,"Riddu",1299);
        System.out.println(N2);
        double N2_Amount = N2.calculateFinalAmount(299);
        System.out.println("Final Amount: " + N2_Amount);

        PremiumOrder P1 = new PremiumOrder(001,"Aster",12999);
        System.out.println(P1);double P1_Amount = P1.calculateFinalAmount();
        System.out.println("Final Amount: " + P1_Amount);

        PremiumOrder P2 = new PremiumOrder(002,"Oshin",12999);
        System.out.println(P2);
        double P2_Amount = P2.calculateFinalAmount(999);
        System.out.println("Final Amount: " + P2_Amount);
    }
}
