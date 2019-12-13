package controller;
import ui.UserIOClass;

/**
 *
 * @author Lindsay Gen10
 * @date Dec 11, 2019
 */
public class Calculator {
    UserIOClass sys = new UserIOClass();
    //methods for calculations
    public double add(double x, double y)
    {
        return x + y;
    }
    public double subtract(double x, double y)
    {
        return x - y;
    }
    public double multiply(double x, double y)
    {
        return x * y;
    }
    public double divide(double x, double y)
    {
        if(y == 0)
        {
            sys.print("Cannot divide by zero!");
            return 0;
        }
        else
        {
            return x / y;
        }
    }
    public double modulo(double x, double y)
    {
        return x % y;
    }
    public double exponent(double x, int y)
    {
        for(int i=1; i<y; i++)
        {
            x *= x;
        }
        return x;
    }
}
