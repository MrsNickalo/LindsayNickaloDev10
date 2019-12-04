/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Scanner;
import java.util.Random;
public class GuessMe {
    public static void main(String[] args)
    {
        //Let's declare our variables first
        int answer;
        int counter = 0;
        char guessAgain;
        Random rGen = new Random();
        Scanner myScanner = new Scanner(System.in);
        int guess;
        //Let's give our number a value between 0 and 100
        answer = rGen.nextInt(201) - 100;
        do
        {
        //Let's ask them to guess
            System.out.println("I've picked a number between -100 and 100, inclusive.");
            System.out.println("Betcha can't guess it!");
            guess = myScanner.nextInt();
            counter++;
            System.out.println("Your guess: " + guess);
            if(guess == answer)
            {
                if(counter==1)
                {
                    System.out.println("Wow, nice guess! That was it!");
                    return;
                }
                else
                {
                    System.out.println("Well, it's about time!");
                    return;
                }
            }
            else if(guess < answer)
            {
                System.out.println("Ha, nice try - too low!");
            }
            else
            {
                System.out.println("Too bad, way too high.");
            }
            System.out.println("Would you like to guess again? (y/n)");
            guessAgain = myScanner.next().charAt(0);
            counter++;
            myScanner.nextLine();
        }while(guessAgain=='y');
        System.out.println("Well, the answer was: " + answer);
    }
}
