/**
 *
 * @author Lindsay Gen10
 * Date: December 09, 2019
 * App to test our abstract class and its sub-classes.
 */
public class App {
    public static void main(String[] args) 
    {
        Triangle test = new Triangle(18, 24, 30);
        System.out.println("Area: " + test.getArea());
        System.out.println("Perimeter: " + test.getPerimeter());
    }
}
