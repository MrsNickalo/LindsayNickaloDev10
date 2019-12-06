/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Scanner;
public class TwoForsAndTenYearsAgo {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("What year would you like to count back from? ");
        int year = myScanner.nextInt();
        for(int i=0; i<=10; i++)
        {
            System.out.println(i + " years ago would be " + (year - i));
        }
        System.out.println("I can count backwards using a different way too...");
        for(int i=year; i>=year-10; i--)
        {
            System.out.println((year - i) + " years ago would be " + i);
        }
    }
}
