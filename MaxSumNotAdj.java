import java.util.Arrays;

public class MaxSumNotAdj {
    public static int solve(int[] arr,int idx,int[] dp){
        if (idx==0) {
            return arr[idx];
        }
        if (idx<0) {
            return 0;
        }
        if (dp[idx]!=-1) {
            return dp[idx];
        }
        int pick=arr[idx]+solve(arr, idx-2,dp);
        int notpick=0+solve(arr, idx-1,dp);
        return dp[idx]= Math.max(pick, notpick);
    }
    public static int solveTab(int[] arr){
        int n=arr.length;
        int[] dp=new int[n];
        dp[0]=arr[0];
        
        for (int i = 1; i < n; i++) {
            int take=arr[i];
            if(i>1){take+=dp[i-2];}
            int notTake=0+dp[i-1];
            dp[i]=Math.max(take, notTake);
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,15,36,59};
        int n=arr.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(solve(arr, arr.length-1,dp));
        System.out.println();
        System.out.println(solveTab(arr));
    }
}
