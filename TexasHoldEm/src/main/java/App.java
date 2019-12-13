/**
 *
 * @author Lindsay Gen10
 * Date: December 09, 2019
 * App for Texas Hold Em
 */
public class App {
    public static void main(String[] args) throws Exception 
    {
        Output.showInstructions();
        Deck myDeck = new Deck();
        //myDeck.shuffleDeck();
        Hand myHand = new Hand(myDeck);
        Output.showHand(myHand);
        Hand dealerHand = new Hand(myDeck);
        myHand.removeCard(myDeck);
        dealerHand.dealerRemoveCard(myDeck);
        Output.showHands(myHand,dealerHand);
    }
}
