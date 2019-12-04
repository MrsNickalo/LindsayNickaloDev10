/**
 *
 * @author Lindsay Gen10
 * Date: December 04, 2019
 */
public class TestingShortcuts {
    public static void main(String[] args)
    {
        boolean test = true;
        int testInt = 4;
        System.out.print("No line ");
        System.out.println("Line");
        while (test) 
        {
            System.out.println("While");
            test = false;
        }
        switch (testInt) 
        {
            case 3:
                System.out.print("Case");
                break;
            default:
                System.out.println("Default");
        }
        
        
    }
}
