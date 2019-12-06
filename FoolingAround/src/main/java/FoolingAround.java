/**
 *
 * @author Lindsay Gen10
 * Date: December 05, 2019
 * Fooling around with different things :)
 */
public class FoolingAround {
    public static void main(String[] args) 
    {
        myMethod();
        System.out.println("Now, we're going to do an equivalent method without the static");
       /* boolean test=false;
        if(test)
            System.out.println("True");
        else
            System.out.println("False");
*/
       // myStaticlessMethod();
       String name1 = new String("John");
       String name2 = "John";
       if(name1 != name2)
            System.out.print("Not ");
        System.out.print("Equal");
    }
    
    public static void myMethod()
    {
        System.out.println("As you can see, this method is working.");
    }
    public void myStaticlessMethod()
    {
        System.out.println("As you can see, no static is working.");
    }
}
