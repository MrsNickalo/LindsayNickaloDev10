/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */

public class BewareTheKraken {
    public static void main(String[] args)
    {
        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOoooOoo....! *SPLASH*");
        int depthDivedFeet = 0;
        while(depthDivedFeet < 36200)
        {
            System.out.println("So far, we've swum " + depthDivedFeet + " feet.");
            if(depthDivedFeet >= 20000)
            {
                System.out.println("Uhhh, I think I see the Kraken, guys....");
                System.out.println("TIME TO GO!!!");
                break;
            }
            depthDivedFeet+= 1000;
        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedFeet + " feet down.");
        System.out.println("I be we can do better next time.");
    }
}
