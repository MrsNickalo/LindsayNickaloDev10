/**
 *
 * @author Lindsay Gen10
 * Date: December 09, 2019
 * Circle class inherits from Shape
 */
public class Circle extends Shape{
    private double radius;
    @Override
    public double getArea()
    {
        return PI * radius * radius;
    }
    @Override
    public double getPerimeter()
    {
        return 2 * PI * radius;
    }
}
