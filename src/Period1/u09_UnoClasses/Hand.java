package Period1.u09_UnoClasses;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand;
    private int defaultNumOfStartingCards;
    //private int playerNum; //possibly helpful at some point?


    public Hand(ArrayList<Card> startingHand){
        startingHand = new ArrayList<>();
        for(Card card : startingHand){
            System.out.println(card);
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
