/**
 *
 * @author Lindsay Gen10
 * Date: December 09, 2019
 * Abstract base class Shape
 */
abstract class Shape {
    protected final double PI = 3.14;
    protected String color;
    abstract double getArea();
    abstract double getPerimeter();
}
