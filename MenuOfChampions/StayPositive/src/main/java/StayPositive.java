/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Scanner;
public class StayPositive {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        int lineCounter = 0;
        int number;
        System.out.println("What number should we countdown from? ");
        number = myScanner.nextInt();
        for(int j = number; j > 0; j--)
        {
            System.out.print(j + ", ");
            lineCounter++;
            if(lineCounter==10)
            {
                System.out.println(" ");
                lineCounter = 0;
            }
        }
    }
}
