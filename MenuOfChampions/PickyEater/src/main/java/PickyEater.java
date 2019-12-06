/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Scanner;
public class PickyEater {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        int timesFried, butterPats;
        char hasSpinach, cheeseCovered, chocolateCovered, funnyName, isBroccoli;
        System.out.print("How many times has it been fried? (#) ");
        timesFried = myScanner.nextInt();
        System.out.print("Does it have any spinach on it? (y/n) ");
        hasSpinach = myScanner.next().charAt(0);
        myScanner.nextLine();
        System.out.print("Is it covered in cheese? (y/n) ");
        cheeseCovered = myScanner.next().charAt(0);
        myScanner.nextLine();
        System.out.print("How many pats of butter are on top? (#) ");
        butterPats = myScanner.nextInt();
        System.out.print("Is it covered in chocolate? (y/n) ");
        chocolateCovered = myScanner.next().charAt(0);
        myScanner.nextLine();
        System.out.print("Does it have a funny name? (y/n) ");
        funnyName = myScanner.next().charAt(0);
        myScanner.nextLine();
        System.out.print("Is it broccoli? (y/n) ");
        isBroccoli = myScanner.next().charAt(0);
        myScanner.nextLine();
        
        //Conditionals
        if(hasSpinach=='y' || funnyName=='y')
        {
            System.out.println("There's no way that'll get eaten.");
        }
        else if(timesFried==3 && chocolateCovered=='y')
        {
            System.out.println("Oh, it's like a deep-fried Snickers. That'll be a hit!");
        }
        else if(timesFried==2 && cheeseCovered=='y')
        {
            System.out.println("Mmm. Yeah, fried cheesy doodles will get et.");
        }
        else if(isBroccoli=='y' && butterPats>6 && cheeseCovered=='y')
        {
            System.out.println("As long as the green is hidden by cheddar, it'll happen!");
        }
        else if(isBroccoli=='y')
        {
            System.out.println("Oh, green stuff like that might as well go in the bin.");
        }
        
    }
}
