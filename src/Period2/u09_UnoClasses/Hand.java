package Period2.u09_UnoClasses;
import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand;
    private int defaultNumOfStartingCards;

    public Hand(ArrayList<Card> startingHand){
        hand = new ArrayList<Card>();
        for(Card card : startingHand){
            hand.add(card);
        }
    }

    public String toString(){
        String s = "";
        for(Card card : hand){
            s += card.toString() + "\n";
        }
        return s;

    }


}
