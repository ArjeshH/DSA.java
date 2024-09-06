import java.util.Arrays;

public class TargetSumArr {
    public static int solve(int[] arr,int tar,int[] dp){
        if (tar==0) {
            return 1;
        }
        if (tar<0) {
            return 0;
        }
        if (dp[tar]!=-1) {
            return dp[tar];
        }
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans+=solve(arr, tar-arr[i],dp);
        }
        return dp[tar]= ans;
    }
    public static int solveTab(int[] arr,int tar){
        int[] dp=new int[tar+1];
        dp[0]=1;
        for (int i = 1; i <= tar; i++) {
            for (int j = 0; j < arr.length; j++) {
               if(i-arr[j]>=0) dp[i]+=dp[i-arr[j]];
            }
        }
        return dp[tar];
    }
    public static void main(String[] args) {

        int[] arr={1,2};
        int tar=3;
        int[] dp=new int[tar+1];
        Arrays.fill(dp, -1);
        System.out.println(solve(arr, tar,dp));
        System.out.println(solveTab(arr, tar));
    }
}
