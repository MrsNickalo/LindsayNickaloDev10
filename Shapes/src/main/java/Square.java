/**
 *
 * @author Lindsay Gen10
 * Date: December 09, 2019
 * Square class inheriting from Shape abstract base class.
 */
public class Square extends Shape{
    private double side;
    @Override
    public double getArea()
    {
        return side * side;
    }
    @Override
    public double getPerimeter()
    {
        return 4 * side;
    }
}
