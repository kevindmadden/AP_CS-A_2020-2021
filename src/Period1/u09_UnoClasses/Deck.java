package Period1.u09_UnoClasses;
import java.util.*;

public class Deck {
    private ArrayList<Card> deck;

    //Create all the cards
    //Somehow shuffle the cards

    public Deck(){
        deck = new ArrayList<Card>();

        String[] colors = {"green", "red", "blue", "yellow"};
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};

        for(String color: colors){
            for(int number: numbers){
                Card card = new Card(color,"numbered",number);
                deck.add(card);
            }
            Card reverse = new Card(color, "reverse");
            Card skip = new Card(color, "skip");

        }

        //Add four cards with the color "all" and the type "wild".
        //Add four cards with the color "all" and the type "wildDraw4".

        for(Card card: deck){
            System.out.println(card);
        }


    }



}
