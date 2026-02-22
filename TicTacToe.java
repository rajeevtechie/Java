import java.util.Scanner;

public class TicTacToe {
    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gameEnded = false;

        System.out.println("=== Tic Tac Toe Game ===");

        while (!gameEnded) {
            printBoard();

            System.out.println("Player " + currentPlayer + ", enter row (1-3) and column (1-3): ");
            int row = sc.nextInt() - 1;
            int col = sc.nextInt() - 1;

            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            board[row][col] = currentPlayer;

            if (checkWin()) {
                printBoard();
                System.out.println("🎉 Player " + currentPlayer + " wins!");
                gameEnded = true;
            } 
            else if (isBoardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                gameEnded = true;
            } 
            else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        sc.close();
    }

    static void printBoard() {
        System.out.println("\n-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    static boolean checkWin() {
        // Rows & Columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer &&
                board[i][1] == currentPlayer &&
                board[i][2] == currentPlayer)
                return true;

            if (board[0][i] == currentPlayer &&
                board[1][i] == currentPlayer &&
                board[2][i] == currentPlayer)
                return true;
        }

        // Diagonals
        if (board[0][0] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][2] == currentPlayer)
            return true;

        if (board[0][2] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][0] == currentPlayer)
            return true;

        return false;
    }

    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }
}