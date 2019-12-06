/**
 *
 * @author Lindsay Gen10
 * Date: December 02,m 2019
*/
import java.util.Scanner;
public class BestAdderEver {
    public static void main(String[] args){
        float varOne, varTwo, varThree, sum;
        String sVarOne, sVarTwo, sVarThree;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter first variable: ");
        sVarOne = myScanner.nextLine();
        System.out.println("Please enter second variable: ");
        sVarTwo = myScanner.nextLine();
        System.out.println("Please enter third variable: ");
        sVarThree = myScanner.nextLine();
        varOne = Float.parseFloat(sVarOne);
        varTwo = Float.parseFloat(sVarTwo);
        varThree = Float.parseFloat(sVarThree);
        sum = varOne + varTwo + varThree;
        System.out.println("Your answer is: " + sum);
    }
}
