import java.util.Arrays;

public class MaxSatisfaction {
    public static int solve(int[] satisfaction,int index,int time,int[][]dp){
        if (index==satisfaction.length) {
            return 0;
        }
        if (dp[index][time]!=-1) {
            return dp[index][time];
        }
        int include=satisfaction[index]*(time+1)+solve(satisfaction, index+1, time+1,dp);
        int exclude=0+solve(satisfaction, index+1, time,dp);
        return dp[index][time]= Math.max(include, exclude);
    }
    public static int maxSatisfaction(int[] satisfaction){
        int n=satisfaction.length;
        int[][] dp=new int[n+1][n+1];
        for (int[] row : dp) {
            Arrays.fill(row,-1);
        }
        Arrays.sort(satisfaction);
        return solve(satisfaction, 0, 0,dp);
    }
    public static int solveTab(int[] satisfaction){
        int n=satisfaction.length;
        int[][] dp=new int[n+1][n+1];
        for(int index=n-1;index>=0;index--){
            for(int time=index;time>=0;time--){
                int include=satisfaction[index]*(time+1)+dp[index+1][time+1];
                int exclude=0+dp[index+1][time];
                dp[index][time]=Math.max(include, exclude);
            }
        }
        return dp[0][0];
    }
    public static void main(String[] args) {
        int[] arr={-1,-8,0,5,-7};
        Arrays.sort(arr);
        System.out.println(maxSatisfaction(arr));
        System.out.println(solveTab(arr));
    }
}
