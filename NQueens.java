public class NQueens { 
    static int N;
    static int[] board;
    public static boolean isSafe(int row, int col) {
        for (int i = 0; i < col; i++) {
            if (board[i] == row || Math.abs(board[i] - row) == Math.abs(i - col)) {
                return false; 
            }
        }
        return true; 
    }
    public static boolean solveNQueens(int col) {
        if (col == N) {
            return true; 
        }

        for (int row = 0; row < N; row++) {
            if (isSafe(row, col)) {
                board[col] = row;
                if (solveNQueens(col + 1)) {

                    return true; 
                }

                board[col] = -1; 
            }

        }

        return false; 
    }


    public static void main(String[] args) { 
        
        N = 8;

        board = new int[N];

        for (int i = 0; i < N; i++) {
            
            board[i] = -1; 
        }

        if (solveNQueens(0)) {

            for (int i = 0; i < N; i++) {

                for (int j = 0; j < N; j++) { 
                    if (board[j] == i) {
                        System.out.print("Q "); } else {
                            System.out.print(". "); 
                        }
                    }

                    System.out.println(); }

                } 
                else {

                    System.out.println("No solution found.");

                } 
            }
        }