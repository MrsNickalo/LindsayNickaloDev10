/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Scanner;
public class DoItBetter {
    public static void main(String[] args){
        //Declare necessary variables
        int miles, hotdogs, languages;
        //Declare scanner
        Scanner myScanner = new Scanner(System.in);
        //Ask user question, take answer and do it better
        System.out.print("How many miles can you run? ");
        miles = myScanner.nextInt();
        System.out.println("Well, I can run " + (2 * miles + 1) + " miles!");
        System.out.print("How many hotdogs can you eat? ");
        hotdogs = myScanner.nextInt();
        System.out.println("Well, I can eat " + (2 * hotdogs + 1) + " hotdogs!");
        System.out.print("How many languages do you know? ");
        languages = myScanner.nextInt();
        System.out.println("Well, I know " + (2 * languages + 1) + " languages! ");
    }
}
