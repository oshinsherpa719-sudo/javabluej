
/**
 * Write a description of class minibookcorner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class minibookcorner
{
    public static void main (String[]args){
       String[] categories = {"Fiction", "Nepali"};

        
        String[][] titles = {
            {"3idiots"},
            {"MunaMadan"}
        };
        double[][] prices = {
            {999.50},
            {750.00}
        };

        for (int i = 0; i < categories.length; i++) {
            System.out.printf("Category: %s\n", categories[i]);
            System.out.printf("Title: %s\n", titles[i][0]);
            System.out.printf("Price: %.2f\n\n", prices[i][0]);
        }
    }
}
