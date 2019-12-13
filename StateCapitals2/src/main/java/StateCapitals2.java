/**
 *
 * @author Lindsay Gen10
 * @date Dec 10, 2019
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;
public class StateCapitals2 {
    public static void main(String[] args) 
    {
        Map<String, Capital> stateCapitals = new HashMap<>();
        //Hard-coding it.... (Tear face)
        //populations pulled from https://www.britannica.com/topic/list-of-state-capitals-in-the-United-States-2119210
        //2010 census reports
        stateCapitals.put("Alabama",new Capital("Montegomery", 205764, 156));
        stateCapitals.put("Alaska", new Capital("Juneau", 31275, 3255));
        stateCapitals.put("Arizona", new Capital("Phoenix", 1445632, 517));
        stateCapitals.put("Arkansas", new Capital("Little Rock", 193524, 122));
        stateCapitals.put("California", new Capital("Sacramento", 466488, 100.1));
        stateCapitals.put("Colorado", new Capital("Denver", 600158, 155));
        stateCapitals.put("Connecticut", new Capital("Hartford", 124775, 17.95));
        stateCapitals.put("Delaware", new Capital("Dover", 26047, 23.48));
        stateCapitals.put("Florida", new Capital("Tallahassee", 181376, 103.1));
        stateCapitals.put("Georgia", new Capital("Atlanta", 420003, 134));
        stateCapitals.put("Hawaii", new Capital("Honolulu", 337256, 68.42));
        stateCapitals.put("Idaho", new Capital("Boise", 206100, 82.8));
        stateCapitals.put("Illinois", new Capital("Springfield", 116250, 66.38));
        stateCapitals.put("Indiana", new Capital("Indianapolis", 820445, 372));
        stateCapitals.put("Iowa", new Capital("Des Moines", 203433, 82.6));
        stateCapitals.put("Kansas", new Capital("Topeka", 127473, 61.47));
        stateCapitals.put("Kentucky", new Capital("Frankfort", 25527, 14.63));
        stateCapitals.put("Lousiana", new Capital("Baton Rouge", 229493, 88.12));
        stateCapitals.put("Maine", new Capital("Augusta", 19136, 58.03));
        stateCapitals.put("Maryland", new Capital("Annapolis", 38394, 8.11));
        stateCapitals.put("Massachusetts", new Capital("Boston", 617594, 89.63));
        stateCapitals.put("Michigan", new Capital("Lansing", 114297, 36.68));
        stateCapitals.put("Minnesota", new Capital("St. Paul", 285068, 56.18));
        stateCapitals.put("Mississippi", new Capital("Jackson", 173514, 113.2));
        stateCapitals.put("Missouri", new Capital("Jefferson City", 43079, 37.58));
        stateCapitals.put("Montana", new Capital("Helena", 28190, 16.39));
        stateCapitals.put("Nebraska", new Capital("Lincoln", 258379, 96.19));
        stateCapitals.put("Nevada", new Capital("Carson City", 55274, 157));
        stateCapitals.put("New Hampshire", new Capital("Concord", 42695, 67.49));
        stateCapitals.put("New Jersey", new Capital("Trenton", 84913, 8.155));
        stateCapitals.put("New Mexico", new Capital("Santa Fe", 67947, 37.41));
        stateCapitals.put("New York", new Capital("Albany", 97856, 21.94));
        stateCapitals.put("North Carolina", new Capital("Raleigh", 403892, 144.8));
        stateCapitals.put("North Dakota", new Capital("Bismarck", 61272, 31.23));
        stateCapitals.put("Ohio", new Capital("Columbus", 787033, 212.5));
        stateCapitals.put("Oklahoma", new Capital("Oklahoma City", 579999, 620));
        stateCapitals.put("Oregon", new Capital("Salem", 154637, 48.45));
        stateCapitals.put("Pennsylvania", new Capital("Harrisburg", 49528, 10.39));
        stateCapitals.put("Rhode Island", new Capital("Providence", 178042, 20.6));
        stateCapitals.put("South Carolina", new Capital("Columbia", 129272, 134.9));
        stateCapitals.put("South Dakota", new Capital("Pierre", 13646, 13.07));
        stateCapitals.put("Tennessee", new Capital("Nashville", 601222, 526));
        stateCapitals.put("Texas", new Capital("Austin", 790390, 271.8));
        stateCapitals.put("Utah", new Capital("Salt Lake City", 186440, 110.4));
        stateCapitals.put("Vermont", new Capital("Montpelier", 7855, 10.27));
        stateCapitals.put("Virginia", new Capital("Richmond", 204214, 62.57));
        stateCapitals.put("Washington", new Capital("Olympia", 46478, 20.09));
        stateCapitals.put("West Virginia", new Capital("Charleston", 51400, 32.64));
        stateCapitals.put("Wisconsin", new Capital("Madison", 233209, 100.9));
        stateCapitals.put("Wyoming", new Capital("Cheyenne", 64019, 28.61));
        Set<String> states = stateCapitals.keySet();
        Collection<Capital> capitals = stateCapitals.values();
        System.out.println("STATE/CAPITAL PAIRS:");
        System.out.println("====================");
        for(String s : states)
        {
            System.out.println(s + stateCapitals.get(s));
        }
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a lower limit for capital city population:");
        int limit = myScanner.nextInt();
        System.out.println("LISTING CAPITALS WITH POPULATIONS GREATER THAN 150000:");
        for(String s : states)
        {
            if(stateCapitals.get(s).getPopulation() > limit)
            {
                System.out.println(s + stateCapitals.get(s));
            }
        }
    }
}
