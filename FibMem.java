import java.util.Arrays;

public class FibMem {
    public static int fib(int[] dp,int n){
        if (n==0 || n==1) {
            return n;
        }
        if (dp[n]!=-1) {
            return dp[n];
        }
        dp[n]=fib(dp, n-1)+fib(dp, n-2);
        return dp[n];
    }
    public static int fibTab(int n){
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i <=n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static int fibOpt(int n){
        int prev1=1;
        int prev2=0;
        int curr=0;
        for (int i = 2; i <=n; i++) {
            curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return curr;
    }
    public static void main(String[] args) {
        int n=8;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fib(dp, n));
        System.out.println();
        System.out.println(fibTab(n));
        System.out.println();
        System.out.println(fibOpt(n));
    }
}
