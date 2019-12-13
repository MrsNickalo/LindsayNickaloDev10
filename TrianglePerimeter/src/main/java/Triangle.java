/**
 *
 * @author Lindsay Gen10
 * @date Dec 11, 2019
 * Class of a triangle.
 */
public class Triangle {
    private double base;
    private double height;
    //constructor
    public Triangle(double b, double h)
    {
        base = b;
        height = h;
    }
    //setter methods
    public void setBase(double b)
    {
        this.base = b;
    }
    public void setHeight(double h)
    {
        this.height = h;
    }
    //getter methods
    public double getBase()
    {
        return base;
    }
    public double getHeight()
    {
        return height;
    }
    //method to calculate area
    public double getArea()
    {
        return base * height;
    }
    //method for right triangles perimeter
    public double getPerimeterRightTriangle()
    {
        return base + height + Math.sqrt((base * base) + (height * height));
    }
    //method for isoceles triangles perimeter
    public double getPerimeterIsoceles()
    {
        return base + (2 * (Math.sqrt(((base/2) * (base/2)) + (height * height))));
    }
    //method for minimum triangle perimeter
    public double getMinimumPerimeter()
    {
        return getPerimeterIsoceles();
    }
    //method to calculate side x when given a
    public double calculateX(double a)
    {
        return Math.sqrt((a * a) + (height * height));
    }
    //method to calculate side y when given a
    public double calculateY(double a)
    {
        return Math.sqrt(((base - a) * (base - a)) + (height * height));
    }
    //method for triangle perimeter
    public double getTrianglePerimeter(double a)
    {
        //calculate this as two right triangles
        Triangle one = new Triangle(a, height);
        Triangle two = new Triangle(base - a, height);
        return (one.getPerimeterRightTriangle() + two.getPerimeterRightTriangle() - (2 * height));
    }
    //method to get maximum perimeter
    public double getMaximumPerimeter()
    {
        return getPerimeterRightTriangle();
    }
    //method to get minimum perimeter when angle is acute
    public double getMinimumPerimeterA()
    {
        return getPerimeterRightTriangle();
    }
    //method to get maximum perimeter possible when angle is acute
    public String getMaximumPerimeterA()
    {
        return "infinity";
    }
}
