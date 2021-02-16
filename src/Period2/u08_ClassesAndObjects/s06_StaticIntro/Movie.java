package Period2.u08_ClassesAndObjects.s06_StaticIntro;

public class Movie {

    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating){
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio){

        /*
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
        */
        //The above block of code does the same exact thing as the below line of code
        this(title, studio, "PG");

    }

    public String getRating(){
        return this.rating;
    }

    public void setRating(String rating){
        this.rating = rating;
    }

    /*
    WHY AN ARRAY OF Movie OBJECTS DEFAULTS TO null:

    Similar to String arrays, Movie arrays (or any other type of object) also have null as their default value
    What this means is that if you ran the line of code below to make a Movie array with 10 elements,
    then all 10 elements in the array will have a default value of null.
    Movie[] movie1 = new Movie[10];

    The reason why the Movie array defaults to null values is because Movie is an object data type.
    And String is also an object data type.
    Any array with an object as the data type will default to null values.

    So why then do arrays of the data type int, double, and boolean not also default to null?
    The reason is because int, double, and boolean are primitive data types.

    The two main categories of data types in java are:
        (1) Primitives: int, double, boolean, char
        (2) Objects: String, (and also any class you write yourself will be an Object data type)
     */
    public static Movie[] getPG(Movie[] movies){
        for(int i=0; i<movies.length; i++){
            if(!movies[i].rating.equals("PG")){
                movies[i] = null;
            }
        }
        return movies;
    }


}
