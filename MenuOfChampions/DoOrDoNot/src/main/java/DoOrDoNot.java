/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Scanner;
public class DoOrDoNot {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Should I do it? (y/n)");
        boolean doIt;
        if(myScanner.next().equals("y"))
        {
            doIt = true;
        }
        else
        {
            doIt = false;
        }
        boolean iDidIt = false;
        /*
        while(doIt)
        {
            iDidIt = true;
            break;
        }
        */
        do
        {
            iDidIt = true;
            break;
        }while(doIt);
        if(doIt && iDidIt)
        {
            System.out.println("I did it!");
        }
        else if(!doIt && iDidIt)
        {
            System.out.println("I know you said not to...but I totally did it anyways.");
        }
        else
        {
            System.out.println("Don't look at me, I didn't do anything!");
        }
    }
}
