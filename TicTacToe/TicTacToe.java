import java.util.Scanner;

public class TicTacToe {
    private static final int BOARD_SIZE = 3;
    private static final char[] PLAYERS = {'X', 'O'};
    private static final char EMPTY_CELL = '-';
    private static char[][] board = new char[BOARD_SIZE][BOARD_SIZE];

    public static void main(String[] args) {
        initializeBoard();
        int currentPlayerIndex = 0;

        while (!isGameOver()) {
            printBoard();
            int[] move = getNextMove(currentPlayerIndex);
            int row = move[0];
            int col = move[1];
            board[row][col] = PLAYERS[currentPlayerIndex];
            currentPlayerIndex = (currentPlayerIndex + 1) % 2;
        }

        printBoard();
        printResult();
    }

    private static void initializeBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = EMPTY_CELL;
            }
        }
    }

    private static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static int[] getNextMove(int currentPlayerIndex) {
        Scanner scanner = new Scanner(System.in);
        int row, col;

        while (true) {
            System.out.print("Player " + PLAYERS[currentPlayerIndex] + "'s turn. Enter row and column (e.g. 1 2): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;

            if (row < 0 || row >= BOARD_SIZE || col < 0 || col >= BOARD_SIZE) {
                System.out.println("Error: Invalid move. Row and column must be between 1 and " + BOARD_SIZE);
            } else if (board[row][col] != EMPTY_CELL) {
                System.out.println("Error: Invalid move. That cell is already occupied");
            } else {
                break;
            }
        }

        return new int[]{row, col};
    }

    private static boolean isGameOver() {
        return isBoardFull() || hasPlayerWon(PLAYERS[0]) || hasPlayerWon(PLAYERS[1]);
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] == EMPTY_CELL) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean hasPlayerWon(char player) {
        // Check rows
        for (int i = 0; i < BOARD_SIZE; i++) {
            boolean rowWin = true;
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] != player) {
                    rowWin = false;
                    break;
                }
            }
            if (rowWin) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < BOARD_SIZE; i++) {
            boolean colWin = true;
            for (int j = 0; j < BOARD_SIZE; j++) {
                if
(board[j][i] != player) {
colWin = false;
break;
}
}
if (colWin) {
return true;
}
}
    // Check diagonal from top left to bottom right
    boolean diagonalWin = true;
    for (int i = 0; i < BOARD_SIZE; i++) {
        if (board[i][i] != player) {
            diagonalWin = false;
            break;
        }
    }
    if (diagonalWin) {
        return true;
    }

    // Check diagonal from top right to bottom left
    diagonalWin = true;
    for (int i = 0; i < BOARD_SIZE; i++) {
        if (board[i][BOARD_SIZE - 1 - i] != player) {
            diagonalWin = false;
            break;
        }
    }
    return diagonalWin;
}

private static void printResult() {
    if (hasPlayerWon(PLAYERS[0])) {
        System.out.println("Player X has won!");
    } else if (hasPlayerWon(PLAYERS[1])) {
        System.out.println("Player O has won!");
    } else {
        System.out.println("It's a tie!");
    }
}
}