import java.util.Arrays;

public class ClimbingStairs {
    public static int countways(int n,int[] ways)
    {
        if (n<0) {
            return 0;
        }
        if (n==0) {
            return 1;
        }
        if (ways[n]!=-1) {
            return ways[n];
        }
        ways[n]=countways(n-1, ways)+countways(n-2, ways);
        return ways[n];
    }
    public static int countWaysTab(int n)
    {
        int[] dp=new int[n+1];
        dp[0]=1;
        for (int i = 1; i <=n; i++) {
            if (i==1) {
                dp[i]=dp[i-1]+0;
            }else{
                dp[i]=dp[i-1]+dp[i-2];
            }
            
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        int[] ways=new int[n+1];
        Arrays.fill(ways,-1);
        // int res=countways(n, ways);
        int res=countWaysTab(n);
        System.out.println(res);
    }
}
