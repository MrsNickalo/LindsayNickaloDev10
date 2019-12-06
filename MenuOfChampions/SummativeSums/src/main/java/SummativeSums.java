/**
 *
 * @author Lindsay Gen10
 * Date: December 05, 2019
 * This program will accept an array of integers, add them all up, and return the total.
 * It will do this for three arrays at a time.
 */
public class SummativeSums {
    public static void main(String[] args) 
    {
        //Arrays that will be passed to the method (pre-defined)
        int[] arrayOne = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] arrayTwo = {999, -60, -77, 14, 160, 301};
        int[] arrayThree = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};
        //outputs sums as requested
        System.out.println("#1 Array Sum: " + sumOfArray(arrayOne));
        System.out.println("#2 Array Sum: " + sumOfArray(arrayTwo));
        System.out.println("#3 Array Sum: " + sumOfArray(arrayThree));
    }
    //This method will accept an array of integers and return the sum
    public static int sumOfArray(int[] numbers)
    {
        int total = 0;
        for(int i:numbers)
        {
            total += i;
        }
        return total;
    }
}
