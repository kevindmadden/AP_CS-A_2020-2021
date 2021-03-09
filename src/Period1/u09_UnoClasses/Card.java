package Period1.u09_UnoClasses;

//Numbered Cards
    //Color
    //Number
//Reverse Card
    //Color
//Skip Card Number Cards
    //Color

//Wild Card
    //(Every Color)
//Draw 4 Wild Card
    //(Every Color)

//Different Colors (Green, Red, Blue, Yellow)

public class Card {
    private String color; //Possible values for color: green, red, blue, yellow, all
    private String type; //Possible values for type: skip, reverse, wild, wildDraw4, numbered
    private int number; //Possible numbers: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 [Use the number -1 when the card has a type other than numbered.]

    public Card(String color, String type, int number){
        this.color = color;
        this.type = type;
        this.number = number;
    }

    public Card(String color, String type){
        this.color = color;
        this.type = type;
        this.number = -1;
    }

    public String toString(){
        String s = color+ " "+type+" "+number;
        return s;
    }

    public String getColor(){
        return color;
    }

    public String getType(){
        return type;
    }

    public int getNumber(){
        return number;
    }



}
