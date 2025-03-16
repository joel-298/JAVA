class Solution {

    // Check if placing a queen is safe
    public boolean isSafe(List<String> board, int row, int column, int n) {
        // Check the board row horizontally
        for (int i = 0; i < n; i++) {
            if (board.get(row).charAt(i) == 'Q') {
                return false;
            }
        }

        // Check vertically
        for (int i = 0; i < row; i++) {
            if (board.get(i).charAt(column) == 'Q') {
                return false;
            }
        }

        // Check left diagonal
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }

        // Check right diagonal
        for (int i = row - 1, j = column + 1; i >= 0 && j < n; i--, j++) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Recursive helper function
    public void helper(int row, int n, List<String> board, List<List<String>> result) {
        if (row == n) {
            result.add(new ArrayList<>(board));
            return;
        }

        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j, n)) {
                // Place the queen by modifying the string
                char[] rowChars = board.get(row).toCharArray();
                rowChars[j] = 'Q';
                board.set(row, new String(rowChars));

                // Recurse for the next row
                helper(row + 1, n, board, result);

                // Backtrack
                rowChars[j] = '.';
                board.set(row, new String(rowChars));
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        List<String> board = new ArrayList<>();
        StringBuilder s = new StringBuilder("") ; 

        // Initialize the board with empty rows
        for (int i = 0; i < n; i++) {
            s.append(".");  
        }
        for(int i = 0 ; i < n ; i++) {
            board.add(s.toString()) ; 
        }

        helper(0, n, board, result);
        return result;
    }
}



1 0 0 0
1 1 1 1   (1,1)
1 1 0 0
0 1 1 1


// 4 directions 
// 1 left
// 2 right
// 3 left 
// 4 up 