
/**
 * Write a description of class RickshawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */ 
import java.util.Scanner;
public class RickshawFare
{
    public static void main(String[] args){
        
        Scanner src = new Scanner(System.in); 
        System.out.println("Enter the distance in km"); 
        double perKm = src.nextDouble(); 
        System.out.println("Enter the time taken");
        double perMinute= src.nextDouble(); 
        System.out.println("Enter the basefare");
        double baseFare= src.nextDouble();  
        
        System.out.println("Enter the distance travel");
        double distance= src.nextDouble();
        System.out.println("Enter the time");
        double time= src.nextDouble();  
        
        System.out.println("Is the customer local?(y/n)");
        String isLocal= src.next().toLowerCase();
        System.out.println("Is it night time travel?(y/n)");
        String isNight= src.next().toLowerCase();
        
        double fare= baseFare+(time*perMinute) +(distance*perKm);   
        if(isLocal.equals("y")&& distance>10) 
        { 
            fare= fare*0.90;
        }
        if(isNight.equals("Y")){
            fare= fare*1.20;
        }
        System.out.println("\n"); 
        
        
        
        System.out.println("RickshawFare"); 
        
        System.out.println("--------"); 
        System.out.println("Final Fare; Rs" + String.format("%.2f", fare));
        System.out.println("--------"); 
        } 
    }  
    
    

        