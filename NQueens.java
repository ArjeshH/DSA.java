public class NQueens {
    public static void main(String[] args) {
        int n=8;
        char[][] board=new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j]='X';
            }
            
        }
        nQueen(board,0);
    }

    private static void nQueen(char[][] board, int row) {
        int n=board.length;
        if (row==n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for (int j = 0; j < n; j++) {
            if (isSafe(row,j,board)) {
                board[row][j]='Q';
                nQueen(board, row+1);
                board[row][j]='X';
            }
        }
    }

    private static boolean isSafe(int row, int col, char[][] board) {
        int n=board.length;
        for (int i = 0; i < n; i++) {
            if (board[i][col]=='Q') {
                return false;
            }
        }
        
        for (int j= 0; j < n; j++) {
            if (board[row][j]=='Q') {
                return false;
            }
        }
        int i=row;
        int j=col;
        while (i>=0 && j<n) {
            if (board[i][j]=='Q') {
                return false;
            }
            i--;
            j++;
            
        }
        i=row;
        j=col;
        while (i>=0 && j>=0) {
            if (board[i][j]=='Q') {
                return false;
            }
            i--;
            j--;
        }
        i=row;
        j=col;
        while (i<n && j>=0) {
            if (board[i][j]=='Q') {
                return false;
            }
            i++;
            j--;
        }
        i=row;
        j=col;
        while (i<n && j<n) {
            if (board[i][j]=='Q') {
                return false;
            }
            i++;
            j++;
        }
        return true;
        
        
    }
}
