import controller.Calculator;
import ui.UserIOClass;
/**
 *
 * @author Lindsay Gen10
 * @date Dec 11, 2019
 * Application for calculator
 */
public class App {
    public static void main(String[] args) 
    {
        UserIOClass sys = new UserIOClass();
        Calculator c = new Calculator();
        sys.print("Welcome to the Calculator!");
        String ans;
        do{
            sys.print("What would you like to do?");
            int answer = sys.readInt("1 - Add two numbers\n"
                    + "2 - Subtract two numbers\n"
                    + "3 - Multiply two numbers\n"
                    + "4 - Divide two numbers\n"
                    + "5 - Modular Arithmetic\n"
                    + "6 - Exponents\n"
                    + "7 - EXIT", 1, 7);
            switch(answer)
            {
                case 1:
                    sys.print(c.add(sys.readDouble("Enter first operand"),sys.readDouble("Enter second operand")));
                    break;
                case 2:
                    sys.print(c.subtract(sys.readDouble("Enter first operand"),sys.readDouble("Enter second operand")));
                    break;
                case 3:
                    sys.print(c.multiply(sys.readDouble("Enter first operand"),sys.readDouble("Enter second operand")));
                    break;
                case 4:
                    sys.print(c.divide(sys.readDouble("Enter first operand"),sys.readDouble("Enter second operand")));
                    break;
                case 5:
                    sys.print(c.modulo(sys.readDouble("Enter first operand"),sys.readDouble("Enter second operand")));
                    break;
                case 6:
                    sys.print(c.exponent(sys.readDouble("Enter first operand"),sys.readInt("Enter second operand")));
                    break;
                default:
                    return;
            }
            ans = sys.readString("Would you like to do something else?");
        }while(ans.equals("y") || ans.equals("Y"));
    }
}
