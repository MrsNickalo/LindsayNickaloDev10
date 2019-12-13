/**
 *
 * @author Lindsay Gen10
 */
public class GameItem {
    String name;
    int[] stats = new int[5];
    //constructor
    public GameItem(String n, int rock, int paper, int scissors, int lizard, int spock)
    {
        name = n;
        stats[0] = rock;
        stats[1] = paper;
        stats[2] = scissors;
        stats[3] = lizard;
        stats[4] = spock;
    }
    //getMethods
    public String getName()
    {
        return name;
    }
    public int[] getStats()
    {
        return stats;
    }
    //this method is to help determine the winner
    public int getStats(int x)
    {
        return stats[x];
    }
}

