/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Scanner;
public class HealthyHearts {
    public static void main(String[] args){
        //Declare necessary variables
        int age, maximum, lower, upper;
        //Give some necessary initial values
        maximum = 220;
        //Declare scanner
        Scanner myScanner = new Scanner(System.in);
        //Ask user for age
        System.out.print("What is your age? ");
        age = myScanner.nextInt();
        //Calculate values
        maximum = maximum - age;
        upper = (int) (maximum * .85 + .5);
        lower = (int) (maximum * .50 + .5);
        //Reveal calculations
        System.out.println("Your maximum heart rate should be " + maximum + " beats per minute.");
        System.out.println("Your target HR Zone is " + lower + " - " + upper + " beats per minute.");
    }
}
