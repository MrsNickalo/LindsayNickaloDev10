package UI;

/**
 *
 * @author Lindsay Gen10
 * @date Dec 12, 2019
 * Class that implements UserIO interface
 */
import java.util.Scanner;
public class View implements UserIO 
{    
    //attributes
    Scanner myScanner = new Scanner(System.in);
    //methods
    
    //method to print given prompt to monitor
    @Override
    public void print(String message)
    {
        System.out.println(message);
    }
    //method to prompt user for int and returns it
    @Override
    public int readInt(String prompt)
    {
        System.out.println(prompt);
        return myScanner.nextInt();
    }
    //method to prompt user for int within boundaries
    @Override
    public int readInt(String prompt, int min, int max)
    {
        System.out.println(prompt);
        int x = myScanner.nextInt();
        while(x > max || x < min)
        {
            System.out.println(prompt);
            x = myScanner.nextInt();
        }
        return x;
    }
    //method to prompt user for int within boundaries inclusive
    @Override
    public int readIntFirm(String prompt, int min, int max)
    {
        System.out.println(prompt);
        int x = myScanner.nextInt();
        while(x >= max || x <= min)
        {
            System.out.println(prompt);
            x = myScanner.nextInt();
        }
        return x;
    }
    //method to prompt user for String and returns it
    @Override
    public String readString(String prompt)
    {
        String x;
        System.out.print(prompt + " ");
        x = myScanner.next();
        myScanner.nextLine();
        return x;
    }
}

