/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Scanner;
public class KnockKnock {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Knock Knock! Guess who it is!");
        String nameGuess = myScanner.nextLine();
        if(nameGuess.equals("Marty McFly") || nameGuess.equals("marty McFly") || nameGuess.equals("marty mcfly") || nameGuess.equals("Marty mcfly"))
        //if(nameGuess == "Marty McFly")
        {
            System.out.println("Hey! That's right! I'm back!");
            System.out.println("...From the Future");
        }
        else
        {
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
    }
}
