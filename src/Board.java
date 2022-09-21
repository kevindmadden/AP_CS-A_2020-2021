public class Board {

    private final Token[][] board;

    public Board() {
        board = new Token[Main.NUM_OF_ROWS][Main.NUM_OF_COLS];

        //board = new Token[10][40]; //change board dimensions for fun
        for (Token[] tokens : board) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(tokens[col]);
            }
            System.out.println("---");
        }
    }

    public Token[][] getBoard() {
        return this.board;
    }

    /*
    7 columns
        -Each col should be 10 as the width
        -The columns will take up space from 0 to 70 (x-coordinates)
    6 rows
        -Each row should be 10 as the width
     */

    public void draw() {
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledRectangle(35, 30, 35, 30);
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                int x = col * 10;
                int y = row * 10;
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.filledCircle(x + 5, y + 5, 4.5);
            }
        }

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                Token tempToken = board[row][col];
                if (tempToken != null) {
                    tempToken.draw(col * 10, row * 10);
                }

            }
        }

        //reset
        if (StdDraw.isKeyPressed(32)) {
            for (int row = 0; row < board.length; row++) {
                for (int col = 0; col < board[0].length; col++) {
                    board[row][col] = null;
                }
            }
        }

    }

    //[row][col]
    public void isGameOver() {


        //Horizontal 'win'
        for (Token[] tokens : board) {
            for (int col = 0; col <= 3; col++) {
                if (tokens[col] != null && tokens[col + 1] != null && tokens[col + 2] != null && tokens[col + 3] != null) {
                    if (tokens[col].getPlayer() == tokens[col + 1].getPlayer()
                            && tokens[col + 1].getPlayer() == tokens[col + 2].getPlayer()
                            && tokens[col + 2].getPlayer() == tokens[col + 3].getPlayer()) {
                        System.out.println("win detected");

                    }
                }
            }
        }
        //Vertical 'win'
        for (int row = 0; row < board.length-3; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] != null && board[row + 1][col] != null && board[row + 2][col] != null && board[row + 3][col] != null) {
                    if (board[row][col].getPlayer() == board[row + 1][col].getPlayer() &&
                            board[row + 1][col].getPlayer() == board[row + 2][col].getPlayer() &&
                            board[row + 2][col].getPlayer() == board[row + 3][col].getPlayer()) {
                        System.out.println("win detected");
                    }
                }
            }
        }

        ////Diagonal 'win' (left to right)
        for (int row = 3; row < board.length; row++) {
            for (int col = 0; col < board[0].length - 3; col++) {
                if (board[row][col] != null && board[row - 1][col + 1] != null && board[row - 2][col + 2] != null && board[row - 3][col + 3] != null) {
                    if (board[row][col].getPlayer() == board[row - 1][col + 1].getPlayer() &&
                            board[row - 1][col + 1].getPlayer() == board[row - 2][col + 2].getPlayer() &&
                            board[row - 2][col + 2].getPlayer() == board[row - 3][col + 3].getPlayer()) {
                        System.out.println("win detected");

                    }
                }
            }
        }

        //Diagonal 'win' (right to left)
        for (int row = 0; row < board.length - 3; row++) {
            for (int col = 0; col < board[0].length -3; col++) {
                if (board[row][col] != null && board[row + 1][col + 1] != null && board[row + 2][col + 2] != null && board[row + 3][col + 3] != null) {
                    if (board[row][col].getPlayer() == board[row + 1][col + 1].getPlayer() &&
                            board[row + 1][col + 1].getPlayer() == board[row + 2][col + 2].getPlayer() &&
                            board[row + 2][col + 2].getPlayer() == board[row + 3][col + 3].getPlayer()) {
                        System.out.println("win detected");
                    }
                }
            }
        }
    }
}