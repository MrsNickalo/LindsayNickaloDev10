/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
public class DifferentKettleOfFish {
    public static void main(String[] args)
    {
        int fish = 1;
        for(int i=fish; i<10; i++)
        {
            if(fish==3)
            {
                System.out.println("RED fish!");
            }
            else if(fish==4)
            {
                System.out.println("BLUE fish!");
            }
            else
            {
                System.out.println(i + " fish!");
            }
        }
    }
}
