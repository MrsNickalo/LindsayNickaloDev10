/**
 *
 * @author Lindsay Gen10
 * Date: December 09, 2019
 * Rectangle inherits from Shape
 */
public class Rectangle extends Shape{
    private double length;
    private double width;
    @Override
    public double getArea()
    {
        return length * width;
    }
    @Override
    public double getPerimeter()
    {
        return length + width + length + width;
    }
}
