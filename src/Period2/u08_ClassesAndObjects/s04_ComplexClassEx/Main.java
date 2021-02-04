package Period2.u08_ClassesAndObjects.s04_ComplexClassEx;

public class Main {
    public static void main(String args[]) {
        //movie1 uses the first constructor because the first constructor has 3 required parameters
        // (and we specified 3 different parameters when creating movie1 below.
        Movie movie1 = new Movie("Toy Story", "Pixar", "G");

        //movie2 uses the second constructor because the second constructor has 2 required parameters
        // (and we specified 2 different parameters when creating movie1 below.
        Movie movie2 = new Movie("Toy Story 2", "Pixar");

        Movie movie3 = new Movie("Toy Story 3", "Pixar");

        Movie movie4 = new Movie("Toy Story 4", "Pixar", "G");

        Movie movie5 = new Movie("Toy Story 5", "Pixar", "R");

        //part c
        Movie[] movies = new Movie[5];
        movies[0] = movie1;
        movies[1] = movie2;
        movies[2] = movie3;
        movies[3] = movie4;
        movies[4] = movie5;

        printMovies(movies);

        //getPG test
        movies = movie1.getPG(movies);

        printMovies(movies);

        //part d
        Movie movie6 = new Movie("Casino Royale", "Eon Productions", "PG-13");

    }

    public static void printMovies(Movie[] movies){

        System.out.println("Normal For-loop");
        for(int i=0; i<5; i++){
            if(movies[i]!=null){
                System.out.println(movies[i].getRating());
            }
        }
        System.out.println("-----");

        // For-each loop example
        // For-each loops are useful when the only reason why you would care about the index number is so that
        // you can cycle through all the index values. A for-each loop accomplishes the same thing in
        // such a situation. The benefit of the for-each loop is there is less room for typos.
        //for each movie (of the data type Movie) located in the array movies, do the following...
        System.out.println("For-each loop");
        for(Movie movie: movies){
            //    ^^^ the variable movie refers to the same thing that is being referred to in
            //    the above for-loop when we typed movies[i]
            if(movie!=null) {
                System.out.println(movie.getRating());
            }
        }
        System.out.println("-----");
    }
}
