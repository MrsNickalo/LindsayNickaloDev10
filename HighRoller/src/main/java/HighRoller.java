/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Random;
import java.util.Scanner;
public class HighRoller {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        Random randomizer = new Random();
        int numSides;
        System.out.println("How many sides would you like?");
        numSides = myScanner.nextInt();
        int roll = randomizer.nextInt(numSides) + 1;
        System.out.println("I rolled a: " + roll);
        if(roll==1)
        {
            System.out.println("You rolled a critical failure!");
        }
        else if(roll==numSides)
        {
            System.out.println("You rolled a critical! Nice Job!");
        }
    }
}
