import java.util.Arrays;

public class Longestsubsequence {
    public static int solve(int n,int[] arr,int curr,int prev,int[][] dp){
        if (curr==n) {
            return 0;
        }
        if(dp[curr][prev+1]!=-1){
            return dp[curr][prev+1];
        }
        int count=0;
        if (prev==-1 || arr[curr]>arr[prev]) {
            count=1+solve(n, arr, curr+1, curr,dp);
        }
        int notTake=0+solve(n, arr, curr+1, prev,dp);
        return dp[curr][prev+1] =Math.max(count, notTake);
    }
    static int lcs(int n,int[] arr){
        int[][] dp=new int[n][n+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(n, arr, 0, -1,dp);
    }
    public static void main(String[] args) {
        int[] arr={2,5,2,8,3,9,3,9,2,9,3,2};
        System.out.println(lcs(arr.length, arr));
    }
}
