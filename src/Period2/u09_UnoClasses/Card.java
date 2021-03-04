package Period2.u09_UnoClasses;

/*

    Color category (Red, Green Blue Yellow, Non-color)

    Different Card Types
    -Wild Draw 4 Cards
    --Non-colored
    -Wild Cards
    --Non-Colored
    -Reverse Card
    --Colored
    -Skip Card
    --Colored
    -Draw 2 Card
    --Colored
    -Numbered Cards
    --Colored

 */

public class Card {
    private String color; //red, blue, green, yellow, mix
    private String type; //wild, wild draw 4, reverse, skip, draw 2, numbered
    private int number; //0, 1, 2, 3, 4, 5, 6, 7, 8, 9, [-1 when the card isn't a numbered card]

    //Use this constructor for numbered cards
    public Card(String color, String type, int number){
        this.color = color;
        this.type = type;
        this.number = number;
    }

    //Use this constructor for non-numbered cards
    public Card(String color, String type){
        this.color = color;
        this.type = type;
        this.number = -1;
    }




}