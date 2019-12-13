/**
 *
 * @author Lindsay Gen10
 * @date Dec 10, 2019
 * Simple program to demonstrate ArrayList capabilities
 */
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListExample {
    public static void main(String[] args) 
    {
        ArrayList<String> stringList = new ArrayList<>();
        System.out.println("List size before adding:" + stringList.size());
        stringList.add("My First");
        System.out.println("List size now: " + stringList.size());
        stringList.add("My Second");
        System.out.println("List size now: " + stringList.size());
        stringList.remove(1);
        System.out.println("List size after first removal: " + stringList.size());
        stringList.remove(0);
        System.out.println("Current size: " + stringList.size());
        stringList.add("First One");
        stringList.add("Second One");
        stringList.add("Third One");
        System.out.println("List size: " + stringList.size());
        System.out.println("Using enhanced for loop:");
        for(String s : stringList)
        {
            System.out.println(s);
        }
        System.out.println("Using iterator:");
        Iterator<String> iter = stringList.iterator();
        while(iter.hasNext())
        {
            String current = iter.next();
            System.out.println(current);
        }
    }
}
