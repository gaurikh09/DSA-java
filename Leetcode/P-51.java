// Welcome to CodeCollab!
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        
        // Track occupied columns and diagonals in O(1)
        boolean[] cols = new boolean[n];
        boolean[] diag1 = new boolean[2 * n - 1]; // row - col + n - 1
        boolean[] diag2 = new boolean[2 * n - 1]; // row + col
        
        backtrack(0, n, board, cols, diag1, diag2, results);
        return results;
    }

    private void backtrack(int row, int n, char[][] board, boolean[] cols, 
                           boolean[] diag1, boolean[] diag2, List<List<String>> results) {
        if (row == n) {
            results.add(constructBoard(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            int d1 = row - col + n - 1;
            int d2 = row + col;

            // Skip if column or either diagonal is already under attack
            if (cols[col] || diag1[d1] || diag2[d2]) {
                continue;
            }

            // Place queen
            board[row][col] = 'Q';
            cols[col] = true;
            diag1[d1] = true;
            diag2[d2] = true;

            // Move to next row
            backtrack(row + 1, n, board, cols, diag1, diag2, results);

            // Backtrack (remove queen)
            board[row][col] = '.';
            cols[col] = false;
            diag1[d1] = false;
            diag2[d2] = false;
        }
    }

    private List<String> constructBoard(char[][] board) {
        List<String> path = new ArrayList<>();
        for (char[] row : board) {
            path.add(new String(row));
        }
        return path;
    }
}