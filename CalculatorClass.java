
/**
 * Write a description of class CalculatorClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */  

import java.util.Scanner;
public class CalculatorClass
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:"); 
        float a=sc.nextFloat();  
        System.out.println("Enter second number:");
        float b=sc.nextFloat(); 
        
        float sum=a+b;
        float diff=(a>b)?a-b:b-a;
        float pro=a*b;
        float quo=(a>b)?a/b:b/a;
        float mod=(a>b)?a%b:b%a;
        float bigger=(a>b)?a:b;
        System.out.println("The sum is:"+sum);
        System.out.println("The difference is:"+diff);
        System.out.println("The product is:"+pro);
        System.out.println("The quotient is:"+quo);
        System.out.println("The remainder is:"+mod);
        System.out.println("The bigger number is: "+bigger);
        
    }
}