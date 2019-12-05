/**
 *
 * @author Lindsay Gen10
 * Date: December 05, 2019
 */
public class SimpleSort {
    public static void main(String[] args) 
    {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 55, 67, 88, 99};
        int[] secondHalf = {1, 4, 8, 11, 15, 18, 21, 44, 54, 79, 89, 100};
        //There's two ways to do this: combine the arrays and then sort
        //or sort as you combine. Which is the better? Well,
        //let's try them both!
        //First up, combine and then sort!
        int[] fullList = new int[firstHalf.length + secondHalf.length];
        //This fills the list
        for(int i=0; i<fullList.length; i++)
        {
            if(i<fullList.length/2)
            {
                fullList[i] = firstHalf[i];
            }
            else
            {
                fullList[i] = secondHalf[i-firstHalf.length];
            }
        }
        //Let's sort this sucker!
        //Let's try a bubble sort
        for(int i=0; i<fullList.length; i++)
        {
            for(int j=i; j<fullList.length; j++)
            {
                if(fullList[i] > fullList[j])
                {
                    int one = fullList[i];
                    fullList[i] = fullList[j];
                    fullList[j] = one;
                }
            }
        }
        for(int i:fullList)
        {
            System.out.print(i + " ");
        }
        System.out.println("");
        //Well, that worked! Now, should we try Method 2???
        int[] fullList2 = new int[firstHalf.length + secondHalf.length];
        int firstI = 0, secondI = 0;
        for(int i=0; i<fullList2.length; i++)
        {
            if(firstI >= firstHalf.length)
            {
                fullList2[i] = secondHalf[secondI];
            }
            else if(secondI >= secondHalf.length)
            {
                fullList2[i] = firstHalf[firstI];
            }
            else if(firstHalf[firstI] < secondHalf[secondI])
            {
                fullList2[i] = firstHalf[firstI];
                firstI++;
            }
            else
            {
                fullList2[i] = secondHalf[secondI];
                secondI++;
            }
        }
        for(int i:fullList2)
        {
            System.out.print(i + " ");
        }
        //As you can see, both methods are effective, but one is more 
        //efficient than the other. Sorting while filling the list makes
        //sense when you are doing it by hand, but when using a computer,
        //using a predefined sort technique after combining the lists is
        //a lot quicker.
    }
}
