/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Scanner;
public class MiniMadLibs {
    public static void main(String[] args){
        //Declare necessary variables
        String one, two, three, four, five, six, seven, eight, nine, ten, userName;
        String i = "Give me a(n) ";
        //Declare Scanner
        Scanner myScanner = new Scanner(System.in);
        //Ask user for words
        System.out.println("Welcome to MINI MAD LIBS!");
        System.out.println("I'm your host, Howard!");
        System.out.println("Here's how you play: I'm going to ask for a type of speech, and you give me a word! When I have enough words, I'll write a story just for you!");
        System.out.print("What's your name? ");
        userName = myScanner.nextLine();
        System.out.println("Hi, " + userName + "! Here we go!");
        System.out.print(i + "noun: ");
        one = myScanner.nextLine();
        System.out.print(i + "adjective: ");
        two = myScanner.nextLine();
        System.out.print(i + "noun: ");
        three = myScanner.nextLine();
        System.out.print(i + "number: ");
        four = myScanner.nextLine();
        System.out.print(i + "adjective: ");
        five = myScanner.nextLine();
        System.out.print(i + "plural noun: ");
        six = myScanner.nextLine();
        System.out.print(i + "plural noun: ");
        seven = myScanner.nextLine();
        System.out.print(i + "plural noun: ");
        eight = myScanner.nextLine();
        System.out.print(i + "verb in the infinitive form: ");
        nine = myScanner.nextLine();
        System.out.print(i + "past particple of the same verb: ");
        ten = myScanner.nextLine();
        for(int j=0; j<=17; j++)
        {
            System.out.print(".oOo");
        }
        System.out.println(".");
        System.out.println("Captain " + userName + ": Star Trek");
        System.out.println(one + ": the " + two + " frontier. These are the voyages of the starship " + three + ".");
        System.out.println("It's a " + four + "-year mission: to explore strange " + five + " " + six + ", to seek out " + five + " " + seven + " and " + five + " " + eight + ",");
        System.out.println("to boldly " + nine + " where no one has " + ten + " before.");
        for(int j=0; j<=17; j++)
        {
            System.out.print(".oOo");
        }
        System.out.println(".");
        System.out.println("Thanks for playing!");
        
    }
}
