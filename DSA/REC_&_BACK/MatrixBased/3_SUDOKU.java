class Solution {
    public boolean isSafe(int row, int column, char[][] board, char target) {
        // Check row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == target) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][column] == target) {
                return false;
            }
        }

        // Check 3x3 subgrid
        int sr = row - row % 3;
        int sc = column - column % 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == target) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean helper(char[][] board, int row, int column) {
        if (column == 9) { // Move to next row if column reaches 9
            row++;
            column = 0;
        }
        if (row == 9) { // If all rows are filled, Sudoku is solved
            return true;
        }

        if (board[row][column] != '.') { // Skip pre-filled cells
            return helper(board, row, column + 1);
        }

        for (int i = 1 ; i <= 9 ; i++) { // Try numbers '1' to '9'
            if (isSafe(row, column, board, (char) (i+'0'))) {
                board[row][column] = (char) (i+'0') ;
                if (helper(board, row, column + 1)) {
                    return true; // If the board is solved, stop recursion
                }
                board[row][column] = '.'; // Backtrack
            }
        }
        return false; // No valid number found, trigger backtracking
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0); // Start solving from (0,0)
    }
}
