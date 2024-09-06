import java.util.Arrays;

public class NinjaPoles {
    public static int solve(int n,int k,int[] dp){
        
        if (n==1) {
            return k;
        }
        if (n==2) {
            return k*(k-1);
        }
        if (dp[n]!=-1) {
            return dp[n];
        }
        int same=solve(n-2, k,dp)*(k-1);
        int diff=solve(n-1, k,dp)*(k-1);
        return dp[n]=same+diff;
    }
    public static int solveTab(int n,int k){
        int[] dp=new int[n+1];
        dp[1]=k;
        dp[2]=k*(k-1);
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-2]*(k-1)+dp[i-1]*(k-1);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=2;
        int k=3;
        int [] dp=new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(solve(n, 3,dp));
        System.out.println(solveTab(n, k));
    }
}
