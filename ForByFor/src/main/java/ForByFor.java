/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
public class ForByFor {
    public static void main(String[] args)
    {
        for(int i=0; i<3; i++)
        {
            System.out.print("|");
            for(int j=0; j<3; j++)
            {
                for(int k=0; k<3; k++)
                {
                    if(j==1 && i%2==0)
                    {
                        System.out.print("$");
                    }
                    else if(j%2==0 && i==1)
                    {
                        System.out.print("@");
                    }
                    else if(j==1 && i==1)
                    {
                        System.out.print("#");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }
                System.out.print("|");
            }
            System.out.println("");
        }
    }
}
