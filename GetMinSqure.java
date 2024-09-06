import java.util.Arrays;

public class GetMinSqure {
    public static int solve(int n,int[] dp){
        if (n==0) {
            return 0;
        }
        if (dp[n]!=-1) {
            return dp[n];
        }
        int ans=n;
        for (int i = 1; i*i <=n; i++) {
            ans=Math.min(ans, 1+solve(n-i*i,dp));
        }
        return dp[n]=ans;
    }
    public static int solveTab(int n){
        int[] dp=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for (int i = 1; i <= n; i++) {
            for(int j=1;j*j<=i;j++){
              if(i-j*j>=0)  dp[i]=Math.min(dp[i],1+dp[i-j*j]);
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=1000;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(solve(n,dp));
        System.out.println(solveTab(n));
    }
}
