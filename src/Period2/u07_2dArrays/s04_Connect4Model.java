package Period2.u07_2dArrays;

public class s04_Connect4Model {


    public static void main(String args[]){
        /*
        This is an example of how you might go about setting things up in order to check all possible
        ways to get 4-in-a-row in the HORIZONTAL direction.
         */
        for(int row = 0; row < 6; row++){
            /*
            There are 7 total columns, but you are checking to see whether the current column
            AND the next three columns (col+1, col+2, col+3) all have tokens belonging to the
            same player. This means you need to end the for-loop for the col section early to
            avoid an out of bounds error.
             */
            for(int col = 0; col < 4; col++){
                System.out.print("Check...");
                System.out.print("board["+row+"]["+col+"], ");
                System.out.print("board["+row+"]["+(col+1)+"], ");
                System.out.print("board["+row+"]["+(col+2)+"], ");
                System.out.print("board["+row+"]["+(col+3)+"]");
                System.out.println("...to see if there are four identical pieces in each of these four spots");
            }
        }

        /*
        NOTE: You may not necessarily want the col for-loop to be inside the row for-loop when you check
        other possible directions for getting 4-in-a-row.
         */

        /*
        BELOW IS THE OUTPUT THAT IS PRINTED WHEN RUNNING THIS CODE.

        Check...board[0][0], board[0][1], board[0][2], board[0][3]...to see if there are four identical pieces in each of these four spots
        Check...board[0][1], board[0][2], board[0][3], board[0][4]...to see if there are four identical pieces in each of these four spots
        Check...board[0][2], board[0][3], board[0][4], board[0][5]...to see if there are four identical pieces in each of these four spots
        Check...board[0][3], board[0][4], board[0][5], board[0][6]...to see if there are four identical pieces in each of these four spots
        Check...board[1][0], board[1][1], board[1][2], board[1][3]...to see if there are four identical pieces in each of these four spots
        Check...board[1][1], board[1][2], board[1][3], board[1][4]...to see if there are four identical pieces in each of these four spots
        Check...board[1][2], board[1][3], board[1][4], board[1][5]...to see if there are four identical pieces in each of these four spots
        Check...board[1][3], board[1][4], board[1][5], board[1][6]...to see if there are four identical pieces in each of these four spots
        Check...board[2][0], board[2][1], board[2][2], board[2][3]...to see if there are four identical pieces in each of these four spots
        Check...board[2][1], board[2][2], board[2][3], board[2][4]...to see if there are four identical pieces in each of these four spots
        Check...board[2][2], board[2][3], board[2][4], board[2][5]...to see if there are four identical pieces in each of these four spots
        Check...board[2][3], board[2][4], board[2][5], board[2][6]...to see if there are four identical pieces in each of these four spots
        Check...board[3][0], board[3][1], board[3][2], board[3][3]...to see if there are four identical pieces in each of these four spots
        Check...board[3][1], board[3][2], board[3][3], board[3][4]...to see if there are four identical pieces in each of these four spots
        Check...board[3][2], board[3][3], board[3][4], board[3][5]...to see if there are four identical pieces in each of these four spots
        Check...board[3][3], board[3][4], board[3][5], board[3][6]...to see if there are four identical pieces in each of these four spots
        Check...board[4][0], board[4][1], board[4][2], board[4][3]...to see if there are four identical pieces in each of these four spots
        Check...board[4][1], board[4][2], board[4][3], board[4][4]...to see if there are four identical pieces in each of these four spots
        Check...board[4][2], board[4][3], board[4][4], board[4][5]...to see if there are four identical pieces in each of these four spots
        Check...board[4][3], board[4][4], board[4][5], board[4][6]...to see if there are four identical pieces in each of these four spots
        Check...board[5][0], board[5][1], board[5][2], board[5][3]...to see if there are four identical pieces in each of these four spots
        Check...board[5][1], board[5][2], board[5][3], board[5][4]...to see if there are four identical pieces in each of these four spots
        Check...board[5][2], board[5][3], board[5][4], board[5][5]...to see if there are four identical pieces in each of these four spots
        Check...board[5][3], board[5][4], board[5][5], board[5][6]...to see if there are four identical pieces in each of these four spots
         */

    }
}
