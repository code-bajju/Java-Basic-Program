import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NQueenProblem {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        int[] queens = new int[n];
        solveNQueensHelper(result, queens, 0, n);
        return result;
    }

    private void solveNQueensHelper(List<List<String>> result, int[] queens, int row, int n) {
        if (row == n) {
            List<String> board = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                char[] rowChars = new char[n];
                Arrays.fill(rowChars, '.');
                rowChars[queens[i]] = 'Q';
                board.add(new String(rowChars));
            }
            result.add(board);
        } else {
            for (int col = 0; col < n; col++) {
                if (isValidPlacement(queens, row, col)) {
                    queens[row] = col;
                    solveNQueensHelper(result, queens, row + 1, n);
                }
            }
        }
    }

    private boolean isValidPlacement(int[] queens, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || queens[i] - col == i - row || queens[i] - col == row - i) {
                return false;
            }
        }
        return true;
    }
}
