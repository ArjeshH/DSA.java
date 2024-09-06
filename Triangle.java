public class Triangle {
    public static int solve(int i,int j,int[][] maze,int[][] dp){
        if (i==maze.length-1) {
            return maze[i][j];
        }
        if (dp[i][j]!=-1) {
            return dp[i][j];
        }
        int down=maze[i][j]+solve(i+1, j, maze,dp);
        int dig=maze[i][j]+solve(i+1, j+1, maze,dp);
        return dp[i][j]=Math.min(down, dig);

    }
    public static int solveTab(int[][] maze,int n){
        
        int[][] dp=new int[n][n];
        for(int j=0;j<n;j++){
            dp[n-1][j]=maze[n-1][j];
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int d=maze[i][j]+dp[i+1][j];
                int dg=maze[i][j]+dp[i+1][j+1];
                dp[i][j]=Math.min(d, dg);
            }
        }
        // for (int k = 0; k < dp.length; k++) {
        //     for (int k2 = 0; k2 < dp.length; k2++) {
        //         System.out.print(dp[k][k2]+" ");
        //     }
        // }
        return dp[0][0];
    }
    public static void main(String[] args) {
        int[][] arr={{1},{2,3},{4,5,6},{7,8,9,10}};
        int n=arr.length;
        int[][] dp=new int[arr.length][arr.length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
            }
        }
        System.out.println(solve(0, 0, arr,dp));
        System.out.println();
        System.out.println(solveTab(arr,n));
        
    }
}
