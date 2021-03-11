package Period2.u09_UnoClasses;
import java.util.*;

public class Deck {
    private ArrayList<Card> deck;

    public Deck(){
        deck = new ArrayList<Card>();

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

        //Add four cards with the color "all" and the type "wild".
        //Add four cards with the color "all" and the type "wildDraw4".

        for(Card card : deck){
            System.out.println(card);
        }




    }

}
