/**
 *
 * @author Lindsay Gen10
 * @date Dec 10, 2019
 * Simple program demonstrating capabilities of Map.
 */
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
public class MapExample {
    public static void main(String[] args) 
    {
        HashMap<String, Integer> populations = new HashMap<>();
        populations.put("USA", 270000000);
        populations.put("Canada", 34000000);
        populations.put("United Kingdom", 63000000);
        populations.put("Japan", 127000000);
        System.out.println("Map size is: " + populations.size());
        Set<String> keys = populations.keySet();
        for(String k : keys)
        {
            System.out.println("The population of " + k + " is " + populations.get(k));
        }
        System.out.println("Population for USA too low...recalculating....");
        populations.put("USA", 313000000);
        for(String k : keys)
        {
            System.out.println("The population of " + k + " is " + populations.get(k));
        }
        System.out.println("Population for Japan:" + populations.get("Japan"));
        Collection<Integer> popValues = populations.values();
        System.out.println("Populations:");
        for(Integer p : popValues)
        {
            System.out.println(p);
        }
        
    }
}
