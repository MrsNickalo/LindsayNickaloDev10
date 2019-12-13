package ui;
/**
 *
 * @author Lindsay Gen10
 * @date Dec 10, 2019
 * Class that implements UserIO interface
 */
import ui.UserIO;
import java.util.Scanner;
public class UserIOClass implements UserIO 
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
    //method that prompts user to input a double and returns it
    @Override
    public double readDouble(String prompt)
    {
        System.out.println(prompt);
        return myScanner.nextDouble();
    }
    //method that prompts user to input a double within submitted boundaries
    @Override
    public double readDouble(String prompt, double min, double max)
    {
        System.out.println(prompt);
        double x = myScanner.nextDouble();
        while(x > max || x < min)
        {
            System.out.println(prompt);
            x = myScanner.nextDouble();
        }
        return x;
    }
    public double readDoubleFirm(String prompt, double min, double max)
    {
        System.out.println(prompt);
        double x = myScanner.nextDouble();
        while(x >= max || x <= min)
        {
            System.out.println(prompt);
            x = myScanner.nextDouble();
        }
        return x;
    }
    //method prompts user for float input and returns it
    @Override
    public float readFloat(String prompt)
    {
        System.out.println(prompt);
        return myScanner.nextFloat();
    }
    //method prompts user for float within bounds
    @Override
    public float readFloat(String prompt, float min, float max)
    {
        System.out.println(prompt);
        float x = myScanner.nextFloat();
        while(x > max || x < min)
        {
            System.out.println(prompt);
            x = myScanner.nextFloat();
        }
        return x;
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
    //method to prompt user to enter long and returns it
    @Override
    public long readLong(String prompt)
    {
        System.out.println(prompt);
        return myScanner.nextLong();
    }
    //method to prompt user to enter long within given boundaries
    @Override
    public long readLong(String prompt, long min, long max)
    {
        System.out.println(prompt);
        long x = myScanner.nextLong();
        while(x > max || x < min)
        {
            System.out.println(prompt);
            x = myScanner.nextLong();
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
    public void print(double d)
    {
        System.out.println(Double.toString(d));
    }
}
