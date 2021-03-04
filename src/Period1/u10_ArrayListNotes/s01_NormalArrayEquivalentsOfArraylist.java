package Period1.u10_ArrayListNotes;

import java.util.List;
import java.util.ArrayList;

public class s01_NormalArrayEquivalentsOfArraylist {
    public static void main(String args[]){
        //Link to methods/cheat sheet section about ArrayList that you'll have for the exam.
            // https://sites.google.com/view/madden-ap-cs-a/arraylist?authuser=0

        //Crreating an Arraylist works very differently from creating something wuth just a normal array.


        //So let's say you wanted to create an array consisting of 10 different int values....
        int[] oldArray = new int[10];

        //If you wanted to create an ArrayList with 10 different elements, it would look very different....
        List<Integer> myList = new ArrayList<Integer>();

        //Primitive versus Object data types?
        //Primitive: int, char, double, boolean
        //Object: String (any custom class you create an object from would be considered an object.

        //How to do the things with ArrayList if you knew how to do them with normal arrays.

        int[] oldArray2 = new int[10]; //create an old array with 10 different elements
        List<Integer> newArray2 = new ArrayList<Integer>(10);

        oldArray[3] = 29; //this would store the value 29 at index location 3
        newArray2.set(3, 29); //this would store the value 29 at index location 3

        System.out.println(oldArray2[3]); //this retrieves the value at index 2 and then prints it out.
        System.out.println(newArray2.get(3));


    }

}
