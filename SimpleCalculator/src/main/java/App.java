/**
 *
 * @author Lindsay Gen10
 * Date: December 09, 2019
 * User Interface (UI) for a simple calculator.
 */
public class App {
    public static void main(String[] args) 
    {
        UserIOClass item = new UserIOClass();
        SimpleCalculator myApp = new SimpleCalculator();
        int selection;
        int x, y;
        do
        {
            //Welcome
            item.print("Welcome to the Simple Calculator.");
            //Get user's selection
            selection = item.readInt("Please select an operation:\n"
                    + "1 - Add\n"
                    + "2 - Subtract\n"
                    + "3 - Multiply\n"
                    + "4 - Divide\n"
                    + "5 - Modular Arithmetic\n"
                    + "6 - EXIT", 1, 6);
            //ends program if user selects EXIT
            if(selection == 6)
            {
                item.print("Thank you for using the Simple Calculator!");
                item.print("Have a nice day!");
                return;
            }
            //get operands for selected operation
            x = item.readInt("Please enter the first operand:");
            y = item.readInt("Please enter the second operand:");
            int answer;
            char operation;
            //do calculation based on selection
            switch(selection)
            {
                case 1:
                    operation = '+';
                    answer = myApp.addNumbers(x,y);
                    break;
                case 2:
                    operation = '-';
                    answer = myApp.subtractNumbers(x, y);
                    break;
                case 3:
                    operation = 'x';
                    answer = myApp.multiplyNumbers(x, y);
                    break;
                case 4:
                    operation = '/';
                    answer = myApp.divideNumbers(x, y);
                    break;
                default:
                    operation = '%';
                    answer = myApp.modulusNumbers(x,y);
            }
            //output answer
            item.print(x + " " + operation + " " + y + " = " + answer);
        }while(selection != 6);
    }
}
