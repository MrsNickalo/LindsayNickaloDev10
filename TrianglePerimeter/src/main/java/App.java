/**
 *
 * @author Lindsay Gen10
 * @date Dec 11, 2019
 * Application for finding the perimeter of a triangle
 * only given its base and height.
 */
public class App {
    public static void main(String[] args) 
    {
        UserIOClass sys = new UserIOClass();
        sys.print("Welcome to Triangle Perimeter!");
        sys.print("Given the base and height, "
                + "we can calculate the perimeter of a "
                + "triangle, with a few stipulations, "
                + "of course.");
        Triangle triangle = 
                new Triangle(
                        sys.readInt("Please enter a base: ",0,100),
                        sys.readInt("Please enter a height: ", 0, 100));
        String answer;
        double perimeter;
        answer = sys.readString("Is this a right triangle? (y/n)");
        if(answer.equals("Y") || answer.equals("y"))
        {
            perimeter = triangle.getPerimeterRightTriangle();
            sys.print("The perimeter is: " + Double.toString(perimeter));
            return;
        }
        answer = sys.readString("Is this an isoceles triangle? (y/n)");
        if(answer.equals("Y") || answer.equals("y"))
        {
            perimeter = triangle.getPerimeterIsoceles();
            sys.print("The perimeter is: " + Double.toString(perimeter));
            return;
        }
        answer = sys.readString("Is the angle opposite the base obtuse or right? (y/n)? ");
        if(answer.equals("Y") || answer.equals("y"))
        {
            sys.print("We can only calculate a minimum value and a maximum value for the perimeter.");
            sys.print("Minimum perimeter (found when triangle is isoceles): " + Double.toString(triangle.getMinimumPerimeter()));
            sys.print("Maximum perimeter (found when triangle is right): " + Double.toString(triangle.getMaximumPerimeter()));
            return;
        }
        sys.print("We can only calculate a minimum value and a maximum value for the perimeter, assuming the angle opposite the base is acute.");
        sys.print("For this, assume that a is the length of the base of the right triangle formed with the height.");
        sys.print("Minimum perimeter (found as a approaches zero): " + Double.toString(triangle.getMinimumPerimeterA()));
        sys.print("Maximum perimeter (found as a approaches infinity): " + triangle.getMaximumPerimeterA());
    }
}
