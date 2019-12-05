/**
 *
 * @author Lindsay Gen10
 * Date: December 05, 2019
 */
import java.util.Random;
import java.util.Scanner;
public class HiddenNuts {
    public static void main(String[] args) 
    {
        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden...");
        for(int i=0; i<hidingSpots.length; i++)
        {
            //This is how I had to handle the null comparison
            //I wonder if there's a better way
            if(hidingSpots[i]==null)
            {
                continue;
            }
            else if(hidingSpots[i].equals("Nut"))
            {
                System.out.println("Here's the nut! It's in hiding spot: " + i);
            }
        }
    }
}
