/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Scanner;
public class RollerCoaster {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        int loops = 0;
        String keepRiding = "y";
        System.out.println("We're going to go on a roller coaster....");
        System.out.println("Let me know when you want to get off...!");
        while(keepRiding.equals("y"))
        {
            System.out.println("WHEEEEEEEeeEEEeeEEEEeeeee....!!!");
            System.out.println("Wnat to keep riding? (y/n) ");
            keepRiding = myScanner.nextLine();
            loops++;
        }
        System.out.println("Wow, that was FUN!");
        System.out.println("We went around the loop " + loops + " times!!");
    }
}
