/**
 *
 * @author Lindsay Gen10
 * Date: December 09, 2019
 * Triangle subclass of Shape.
 */
public class Triangle extends Shape{
    private double height;
    private double base;
    private double sideA, sideB, sideC;
    public Triangle(double a, double b, double c)
    {
        sideA = a;
        sideB = b;
        sideC = c;
    }
    public Triangle(double h, double b)
    {
        height = h;
        base = b;
    }
    @Override
    public double getArea()
    {
        if(base != 0 && height != 0)
        {
            return (1/2) * base * height;
        }
        else
        {
            double p = (sideA + sideB + sideC)/2;
            return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
        }
    }
    @Override
    public double getPerimeter()
    {
        if(sideA != 0 && sideB != 0 && sideC != 0)
        {
            return sideA + sideB + sideC;
        }
        else
        {
            double perimeterMin;
            perimeterMin = base + height + Math.sqrt((base * base) + (height * height));
            System.out.println("Not enough information about the triangle was given.");
            System.out.println("The minimum area possible is (assuming the triangle is a right triangle: ");
            return perimeterMin;
        }
    }
}
