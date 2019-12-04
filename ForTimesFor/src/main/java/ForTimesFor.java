
import java.util.Scanner;

/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
public class ForTimesFor {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        int times;
        int answer, points;
        points = 0;
        System.out.println("Which times table shall we practice?");
        times = myScanner.nextInt();
        for(int i=1; i<=15; i++)
        {
            System.out.print(i + " * " + times + " is: ");
            answer = myScanner.nextInt();
            if(answer == i*times)
            {
                System.out.println("Correct!");
                points++;
            }
        }
        System.out.println("You got " + points + " right.");
        if(points < 8)
        {
            System.out.println("You need to study more...");
        }
        else if(points >13)
        {
            System.out.println("Nice Job!");
        }
    }

}
