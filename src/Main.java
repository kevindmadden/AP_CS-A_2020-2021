import java.awt.*;  // Color library

public class Main {
    public static void main(String[] args) {

        // Player 1 is red
        // Player 2 is blue

        StdDraw.setXscale(-0.0, +7);
        StdDraw.setYscale(-0.0, +7);
        StdDraw.enableDoubleBuffering();

        double dt = 0.017;      // Frame rate

        boolean ClickTracker = false;
        boolean Clicked = false;
        boolean gameFinished = false;

        // Randomly choose first player
        int currentPlayer = 1;
        if (Math.random() > 0.5)
            currentPlayer = 2;
        Font font = new Font("Arial", Font.BOLD, 30);
        StdDraw.setFont(font);
        StdDraw.text(3.5,6.5, "Player " + currentPlayer + " goes first!");

        int[][] board = new int[7][6];


        while (!gameFinished){

            // Drawing the board
            for (int i = 0; i < board.length; i++){
                for (int j = 0; j < board[0].length; j++){
                    // Draw Grid
                    StdDraw.setPenColor(Color.black);
                    StdDraw.setPenRadius(0.005);
                    StdDraw.square(i+ 0.5, j + 0.5, 0.5);

                    // Draw Player 1 Tokens
                    if (board[i][j] == 1){
                        StdDraw.setPenColor(Color.red);
                        StdDraw.filledCircle(i+0.5, j+0.5, 0.25);
                    }

                    // Draw Player 2 Tokens
                    if (board[i][j] == 2){
                        StdDraw.setPenColor(Color.blue);
                        StdDraw.filledCircle(i+0.5, j+0.5, 0.25);
                    }
                }
            }


            // Check for winner
            int gameResult = checkForWinner(board);
            if (gameResult != 0){
                gameFinished = true;

                if (gameResult == 1) {
                    StdDraw.setPenColor(Color.red);
                    StdDraw.filledRectangle(3.5, 6.5, 3.5, 0.5);
                    StdDraw.setPenColor(Color.black);
                    StdDraw.text(3.5, 6.5, "Player 1 has won!");
                }
                if (gameResult == 2) {
                    StdDraw.setPenColor(Color.blue);
                    StdDraw.filledRectangle(3.5, 6.5, 3.5, 0.5);
                    StdDraw.setPenColor(Color.black);
                    StdDraw.text(3.5, 6.5, "Player 2 has won!");
                }
                if (gameResult == 3){
                    StdDraw.setPenColor(Color.black);
                    StdDraw.text(3.5, 6.5, "There is a tie.");
                }
            }


            // Click Detector
            if(StdDraw.isMousePressed()){
                ClickTracker = true;
            }
            if(!StdDraw.isMousePressed()){
                if(ClickTracker){
                    Clicked = true;
                    ClickTracker = false;
                }
            }


            // Record moves
            if(Clicked){
                Clicked = false;
                int xClicked = (int)(StdDraw.mouseX());

                boolean goodClick = true;

                int lowestSlot = lowestSlot(board, xClicked);
                if (lowestSlot == 10){
                    goodClick = false;
                }

                if (goodClick){                                 // If Slots are available, draw at lowest slot
                    board[xClicked][lowestSlot] = currentPlayer;
                    if(currentPlayer == 1)
                        currentPlayer = 2;
                    else
                        currentPlayer = 1;
                }
            }

            StdDraw.show();
            StdDraw.pause((int) (dt * 1000));
        }
    }


    public static int checkForWinner (int[][] board){
        // Checking Horizontals
        for (int i = 0; i < board.length-3; i++){
            for (int j = 0; j < board[0].length-1; j++){
                if ((board[i][j] == board[i+1][j]) && (board[i][j] == board[i+2][j]) && (board[i][j] == board[i+3][j]) && (board[i][j] != 0)){
                    return board[i][j];
                }
            }
        }

        // Checking Verticals
        for (int i = 0; i < board.length-1; i++){
            for (int j = 0; j < board[0].length-3; j++){
                if ((board[i][j] == board[i][j+1]) && (board[i][j] == board[i][j+2]) && (board[i][j] == board[i][j+3]) && (board[i][j] != 0)){
                    return board[i][j];
                }
            }
        }

        // Checking Lower-Left to Upper-Right Diagonal
        for (int i = 0; i < board.length-3; i++){
            for (int j = 0; j < board[0].length-3; j++){
                if ((board[i][j] == board[i+1][j+1]) && (board[i][j] == board[i+2][j+2]) && (board[i][j] == board[i+3][j+3]) && (board[i][j] != 0)){
                    return board[i][j];
                }
            }
        }

        // Checking Upper-Left to Lower-Right Diagonal
        for (int i = 0; i < board.length-3; i++){
            for (int j = 3; j < board[0].length; j++){
                if ((board[i][j] == board[i+1][j-1]) && (board[i][j] == board[i+2][j-2]) && (board[i][j] == board[i+3][j-3]) && (board[i][j] != 0)){
                    return board[i][j];
                }
            }
        }

        // Checking Tie
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if (board[i][j] == 0)
                    return 0;
            }
        }
        return 3;
    }


    public static int lowestSlot (int[][] board, int x){
        int lowestSlot = 0;
        for (int i = 0; i < board[x].length; i++){
            if (board[x][i] == 0)
                return lowestSlot;
            else
                lowestSlot++;
        }
        return 10; // returns fail number if column is full
    }
}
