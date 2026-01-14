package week10;


/**
 * Write a description of class PremiumOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumOrder extends order
{


    public PremiumOrder(int OrderID, String customerName, double amount)
    {
        super(OrderID, customerName, amount);
    }

    @Override
    public double calculateFinalAmount()
    {
        return super.calculateFinalAmount();
    }

    public double calculateFinalAmount(double discountAmount)
    {
        return this.calculateFinalAmount() - discountAmount;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
