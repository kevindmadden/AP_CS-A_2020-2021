package Period1.u09_UnoClasses;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck;

    public Deck(){
        deck = new ArrayList<Card>();

        //adds numbered, reverse, skip cards
        String[] colors = {"red", "blue", "green", "yellow"};
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(String color : colors){
            for(int number : numbers){
                Card card = new Card(color, "numbered", number);
                deck.add(card);
            }
            Card reverse = new Card(color, "reverse");
            deck.add(reverse);
            Card skip = new Card(color, "skip");
            deck.add(skip);
        }

        //adds wild cards
        for(int i = 0; i<4; i++){
            Card wild = new Card("all", "wild");
            deck.add(wild);
            Card wildDraw4 = new Card("all", "wildDraw4");
            deck.add(wildDraw4);
        }

        //Add four cards with the color "all" and the type "wild".
        //Add four cards with the color "all" and the type "wildDraw4".
    }

    public void shuffle(){

        /*
            -- Comparison of swapping two array items in normal arrays vs arraylist --
        //normal array way to swap two elements
        int[] a = {5,6,7,8,9};
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;

        //how to swap two elements with arrayList
        Card temp2 = deck.get(0);
        deck.set(0, deck.get(1));
        deck.set(1, temp2);
         */

        for(int i=0; i<10000; i++){
            int randomIndexNum1 = (int)(Math.random()*deck.size());
            int randomIndexNum2 = (int)(Math.random()*deck.size());
            Card tempCard = deck.get(randomIndexNum1);
            deck.set(randomIndexNum1,deck.get(randomIndexNum2));
            deck.set(randomIndexNum2,tempCard);
        }
    }

    public Card drawTopCard(){
        Card removedCard;
        if(deck.size()==0){
            removedCard = null;
        }else{
            removedCard = deck.remove(0);
        }
        return removedCard;

    }

    public ArrayList<Card> drawStartingHand(){
        ArrayList<Card> startingHand = new ArrayList<Card>();
        for(int i=0; i < 7; i++){
            startingHand.add(drawTopCard());
        }
        return startingHand;
    }

    public String toString(){
        String s = "";
        for(Card card : deck){
            s += card.toString() + "\n";
        }
        return s;
    }

    public void draw(){
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledRectangle(70,50, 8, 12);

    }

}
