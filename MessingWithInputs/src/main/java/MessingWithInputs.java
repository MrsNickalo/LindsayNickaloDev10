/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 * Messing around with input types and reading it in through the scanner
 */
import java.util.Scanner;
public class MessingWithInputs {
    public static void main(String[] args){
        //Declare a variable of each type and a scanner
        int intVar;
        double doubleVar;
        float floatVar;
        char charVar;
        String stringVar;
        long longVar;
        boolean booleanVar;
        byte byteVar;
        short shortVar;
        Scanner myScanner = new Scanner(System.in);
        //Let's get some input!
        System.out.print("int: ");
        intVar = myScanner.nextInt();
        System.out.println("You entered the integer: " + intVar);
        System.out.print("double: ");
        doubleVar = myScanner.nextDouble();
        System.out.println("You entered the double: " + doubleVar);
        System.out.print("float: ");
        floatVar = myScanner.nextFloat();
        System.out.println("You entered the float: " + floatVar);
        System.out.print("char: ");
        charVar = myScanner.next().charAt(0);
        System.out.println("You entered the char: " + charVar);
        myScanner.nextLine();
        System.out.print("String: ");
        stringVar = myScanner.nextLine();
        System.out.println("You entered the string: " + stringVar);
        System.out.print("long: ");
        longVar = myScanner.nextLong();
        System.out.println("You entered the long: ");
        System.out.print("boolean: ");
        booleanVar = myScanner.nextBoolean();
        System.out.println("You entered the boolean: " + booleanVar);
        System.out.print("byte: ");
        byteVar = myScanner.nextByte();
        System.out.println("You entered the byte: " + byteVar);
        System.out.print("short: ");
        shortVar = myScanner.nextShort();
        System.out.println("You entered the short: " + shortVar);
        
    }
}
