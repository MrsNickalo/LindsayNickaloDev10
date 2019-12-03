/**
 *
 * @author Lindsay Gen10
 * Date: December 02, 2019
 * Calculates cost of windows and trim
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Window {
    public static void main(String[] args){
        //declaration of necessary variables
        float height = 0;
        float width = 0;
        float perimeter = 0;
        float area = 0;
        float glassCost = 0;
        float trimCost = 0;
        String stringHeight = "";
        String stringWidth = "";
        //initialize our scanner for input
        Scanner myScanner = new Scanner(System.in);
        //ask user to input height
        System.out.println("Please enter the height of the window (in feet): ");
        stringHeight = myScanner.nextLine();
        //ask user to input width
        System.out.println("Please enter the width of the window (in feet): ");
        stringWidth = myScanner.nextLine();
        //convert Strings to floats
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        //calculate area, perimeter, and costs
        area = height * width;
        perimeter = width + width + height + height;
        glassCost = area * 3.50f;
        trimCost = perimeter * 2.25f;
        //convert costs to two decimal places
        DecimalFormat df = new DecimalFormat("0.00");
        //print out results     
        System.out.println("Window Height: " + height + " feet");
        System.out.println("Window Width: " + width + " feet");
        System.out.println("Window Area: " + area + " feet squared");
        System.out.println("Window Perimeter: " + perimeter + " feet");
        System.out.println("Cost of Glass: $" + df.format(glassCost));
        System.out.println("Cost of Trim: $" + df.format(trimCost));
        
        
    }
    
}
