/**
 *
 * @author Lindsay Gen10
 * @date Dec 11, 2019
 * Messing around with Pascal's Triangle
 */
import java.util.Scanner;
public class PascalTriangle {
    public static void main(String[] args) 
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("WELCOME TO PASCAL'S TRIANGLE!");
        System.out.println("---------------------------------------------------------");
        System.out.println("What row would you like the triangle to go out to?");
        int rows = myScanner.nextInt();
        System.out.println("---------------------------------------------------------");
        pascal(rows, rows);
    }
    public static int factorial(int x)
    {
        if(x <= 1)
        {
            return 1;
        }
        else
        {
            return x * factorial(x-1);
        }
    }
    public static void pascal(int rows, int first)
    {
        int x = first;
        if(rows==1)
        {
            for(int i=0; i<x - rows; i++)
            {
                System.out.print(" ");
            }
            System.out.println(" " + rows);
        }
        else if(rows==2)
        {
            pascal(1,x);
            for(int i=0; i<x - rows; i++)
            {
                System.out.print(" ");
            }
            System.out.println("1   1");
        }
        else
        {
            pascal(rows - 1, x);
            for(int i=0; i<x - rows; i++)
            {
                System.out.print(" ");
            }
            for(int i=0; i<=rows; i++)
            {
                System.out.print((factorial(rows))/((factorial(rows - i))*(factorial(i))) + " ");
            }
            System.out.println("");
        }
    }
}
