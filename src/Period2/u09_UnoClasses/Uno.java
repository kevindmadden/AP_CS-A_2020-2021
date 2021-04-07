package Period2.u09_UnoClasses;

public class Uno {
    public static void main(String args[]){
        Deck deck = new Deck();
        deck.shuffle();

        Hand player1 = new Hand(deck.drawStartingHand());
        Hand player2 = new Hand(deck.drawStartingHand());

        Discard discard = new Discard(deck.drawTopCard());

        //Good place to start:
        // 1. Figure out how to draw the deck.
        // 2. Figure out how to draw the cards (cards are in different locations)

        StdDraw.setXscale(-0.0, +100);
        StdDraw.setYscale(-0.0, +100);
        StdDraw.enableDoubleBuffering();

        double timeElapsed = 0.017; //formerly called "dt". This is number of seconds between each frame of the animation -  0.017 milliseconds is the same as 60fps
        while(true){
            StdDraw.clear();

            deck.draw();



            StdDraw.show();
            StdDraw.pause((int)(timeElapsed*1000));
        }

    }


    /*

    Overall Game
    -Checking to see if someone won the game
    -Rules of the game
    -Saying uno (maybe we include this...?)
    -Multiplayer/Computer Players

    Where Can the Cards Be Located?
    =Deck pile
     -Shuffle
     -Draw Cards
    =Discard Pile
     -Remove cards when time to reshuffle
     -Card at the very top
     -Cards placed by player on top
    =Hand
     -Places drawn cards in hand
     -Plays cards by placing them on top of the discard pile

     */

}
