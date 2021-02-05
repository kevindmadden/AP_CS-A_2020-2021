import java.util.Random;
import java.util.Scanner;

public class Main {

    static int lastRow, lastCol;
    static final int ROWS = 6, COLUMNS = 7;

    public static void main(String[] args) {

        int[][] board = new int[ROWS][COLUMNS];
        Scanner scanner = new Scanner(System.in);

        // randomly select the player to start the game
        int [] players = new int[]{1, 2};
        int playerIndex = new Random().nextInt(2);
        int columnSelected, currentPlayer, winner;
        currentPlayer = players[playerIndex];
        System.out.println("\nPlayer " + currentPlayer + " will start the game. ");
        printBoard(board);

        do {	// This will loop until we have a winner or a tie in the end.
            System.out.println("\nPlayer " + currentPlayer + " select a column between 1-7: ");
            columnSelected = scanner.nextInt();
            while (!checkIfColumnHasEmptySpot(board, columnSelected)) {
                System.out.println("\nSelected column " + columnSelected + " is not emptly. Please select another column: ");
                printBoard(board);
                columnSelected = scanner.nextInt();
            }
            for (int i = ROWS -1; i >= 0; i--) {
                if (board[i][columnSelected - 1] != 0)
                    continue;
                else {
                    board[i][columnSelected - 1] = currentPlayer;
                    lastRow = i;
                    lastCol = columnSelected - 1;
                    break;
                }
            }

            // switch current player
            currentPlayer = currentPlayer == 1 ? 2 : 1;
            printBoard(board);
            winner = checkForWinner(board);
        } while (winner == 0);

        System.out.print("Game over. ");
        if (winner == 1)
            System.out.println("Player 1 won the game.");
        else if (winner == 2)
            System.out.println("Player 2 won the game.");
        else
            System.out.println("Its a tie.");

        scanner.close();
    }

    public static boolean checkIfColumnHasEmptySpot(int[][] board, int column) {
        boolean isEmpty = false;
        for(int i = 0; i < ROWS; i++) {
            if (board[i][column-1] != 0)
                continue;
            else
                isEmpty = true;
        }
        return isEmpty;
    }

    public static void printBoard(int[][] board) {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++)
                System.out.print(board[row][col] + "\t");
            System.out.println();
        }
    }

    public static int checkForWinner(int[][] board) {
        int winner = 0;
        String winningStreak;
        StringBuilder sb = new StringBuilder(COLUMNS);
        boolean horizontal = false, vertical = false, leftDiagonal = false, rightDiagonal = false;

        int lastPlayedVal = board[lastRow][lastCol];

        winningStreak = String.format("%d%d%d%d", lastPlayedVal, lastPlayedVal, lastPlayedVal, lastPlayedVal);

        // Check horizontallyy
        for (int i = 0; i < COLUMNS; i++)
            sb.append(board[lastRow][i]);

        if (sb.toString().indexOf(winningStreak) >= 0) {
            horizontal = true;
        }

        // Check vertically
        if (!horizontal) {
            sb = new StringBuilder(COLUMNS);
            for (int i = lastRow; i < ROWS; i++) {
                sb.append(board[i][lastCol]);
            }

            if (sb.toString().indexOf(winningStreak) >= 0) {
                vertical = true;
            }
        }

        // check "/" diagonal
        if (!horizontal && !vertical) {
            sb = new StringBuilder(COLUMNS);

            int i = lastRow, j = lastCol;
            while (i < ROWS && j >= 0) {
                sb.append(board[i][j]);
                i++;
                j--;
            }

            if (sb.toString().indexOf(winningStreak) >= 0) {
                leftDiagonal = true;
            }
        }

        if (!horizontal && !vertical && !leftDiagonal) {
            sb = new StringBuilder(COLUMNS);
            int i = lastRow, j = lastCol;
            while (i < ROWS && j < COLUMNS) {
                sb.append(board[i][j]);
                i++;
                j++;
            }

            if (sb.toString().indexOf(winningStreak) >= 0) {
                rightDiagonal = true;
            }

        }

        if (horizontal || vertical || leftDiagonal || rightDiagonal)
            winner = lastPlayedVal;


        // check if it is a tie; if not declare the winner.
        boolean boardFull = true;
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                if (board[row][col] == 0) {
                    boardFull = false;
                    break;
                }
            }
            if (!boardFull)
                break;
        }
        if (boardFull && winner == 0)
            winner = 3;

        return winner;
    }

}