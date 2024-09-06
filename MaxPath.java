import java.util.Arrays;

public class MaxPath {
    public static int solve(int i,int j,int m,int[][] grid,int[][] dp){
        if (j<0 || j>=m) {
            return (int)Math.pow(-10, 9);
        }
        if (i==0) {
            return grid[i][j];
        }
        if (dp[i][j]!=-1) {
            return dp[i][j];
        }
        
            int u=grid[i][j]+solve(i-1, j,m, grid,dp);
            int ul=grid[i][j]+solve(i-1, j-1,m, grid,dp);
            int ur=grid[i][j]+solve(i-1, j+1,m, grid,dp);
            return dp[i][j]=Math.max(ul,Math.max(u, ur));
            
        }
        
    public static int maxPath(int[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        int dp[][] = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row,-1);
        }
        int maxi=Integer.MIN_VALUE;
        for(int j=0;j<grid[0].length;j++){
            int ans=solve(n-1, j,m, grid,dp);
            maxi=Math.max(maxi, ans);
        }
        return maxi;
    }
    public static int getPathSum(int[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        int[][] dp=new int[n][m];
        for(int j=0;j<n;j++){
            dp[0][j]=grid[0][j];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int u=grid[i][j]+dp[i-1][j];
                int ul=grid[i][j];
                if (j-1>=0) {
                    ul+=dp[i-1][j-1];
                }else{
                    ul+=(int)Math.pow(-10, 9);
                }
                int ur=grid[i][j];
                if (j+1<m) {
                    ur+=dp[i-1][j+1];
                }else{
                    ur+=(int)Math.pow(-10, 9);
                }
                dp[i][j]=Math.max(ul,Math.max(u, ur));
            }
            

        }
        int maxi=Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
                maxi=Math.min(maxi, dp[n-1][j]);
            }
        return maxi;
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,10,4},{100,3,2,1},{1,1,20,2},{1,2,2,1}};
        System.out.println(maxPath(arr));
        System.out.println(getPathSum(arr));
    }
}
