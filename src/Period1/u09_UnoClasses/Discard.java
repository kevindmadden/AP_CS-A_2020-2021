package Period1.u09_UnoClasses;
import java.util.*;

public class Discard {
    private ArrayList<Card> discard;

    public Discard(Card startingCard){
        discard = new ArrayList<Card>();
        placeCard(startingCard);
    }

    public void placeCard(Card card){

        discard.add(card);
    }

}
