package UI;
/**
 *
 * @author Lindsay Gen10
 * @date Dec 12, 2019
 * Console implementation of the UserIO Interface.
 */
import java.util.Scanner;
public class UserIOConsoleImpl implements UserIO {
    //attributes
    Scanner myScanner = new Scanner(System.in);
    //methods
    //method to print to console
    @Override
    public void print(String prompt)
    {
        System.out.println(prompt + " ");
    }
    //method to read in double from console
    @Override
    public double readDouble(String prompt)
    {
        System.out.println(prompt + " ");
        return myScanner.nextDouble();
    }
    //method to read in double from console within boundaries inclusive
    @Override
    public double readDouble(String prompt, double min, double max)
    {
        System.out.println(prompt + " ");
        double x = myScanner.nextDouble();
        while(x > max || x < min)
        {
            System.out.println(prompt + " ");
            x = myScanner.nextDouble();
        }
        return x;
    }
    //method to read in float from console
    @Override
    public float readFloat(String prompt)
    {
        System.out.println(prompt + " ");
        return myScanner.nextFloat();
    }
    //method to read in float from console within boundaries inclusive
    @Override
    public float readFloat(String prompt, float min, float max)
    {
        System.out.println(prompt + " ");
        float x = myScanner.nextFloat();
        while(x > max || x < min)
        {
            System.out.println(prompt + " ");
            x = myScanner.nextFloat();
        }
        return x;
    }
    //method to read in int from console
    @Override
    public int readInt(String prompt)
    {
        System.out.println(prompt + " ");
        return myScanner.nextInt();
    }
    //method to read in int from console within boundaries inclusive
    @Override
    public int readInt(String prompt, int min, int max)
    {
        System.out.println(prompt + " ");
        int x = myScanner.nextInt();
        while(x > max || x < min)
        {
            System.out.println(prompt + " ");
            x = myScanner.nextInt();
        }
        return x;
    }
    //method to read in long from console
    @Override
    public long readLong(String prompt)
    {
        System.out.println(prompt + " ");
        return myScanner.nextLong();
    }
    //method to read in double from console within boundaries inclusive
    @Override
    public long readLong(String prompt, long min, long max)
    {
        System.out.println(prompt + " ");
        long x = myScanner.nextLong();
        while(x > max || x < min)
        {
            System.out.println(prompt + " ");
            x = myScanner.nextLong();
        }
        return x;
    }
    //method to read in String from console
    @Override
    public String readString(String prompt)
    {
        String x;
        System.out.print(prompt + " ");
        x = myScanner.next();
        myScanner.nextLine();
        return x;
    }
    //WORKAROUND FOR PRESS ENTER PROBLEM
    @Override
    public String readStringEnter(String prompt)
    {
        System.out.print(prompt + " ");
        return myScanner.nextLine();
    }
}
