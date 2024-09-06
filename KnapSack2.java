import java.util.Arrays;

public class KnapSack2 {
    public static int knapSack(int[] val,int[] wt,int W,int n,int[][] dp){
        if (n==0 || W==0) {
            return 0;
        }
        if (dp[n][W]!=-1) {
            return dp[n][W];
        }
        if (wt[n-1]<=W) {
            int ans1=val[n-1]+knapSack(val, wt, W-wt[n-1], n-1,dp);
            int ans2=0+knapSack(val, wt, W, n-1,dp);
            return dp[n][W]= Math.max(ans1, ans2);
        }else{
            return dp[n][W]= knapSack(val, wt, W, n-1,dp);
        }
    }
    public static int knapSackTab(int[] val,int[] wt,int W){
        int n=val.length;
        int[][] dp=new int[n+1][W+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;
        }
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= W; j++) {
                int v=val[i-1];
                int w=wt[i-1];
                if(w<=j){
                int incPr=v+dp[i-1][j-w];
                int exPr=dp[i-1][j];
                dp[i][j]=Math.max(incPr, exPr);
            }
            else{
                dp[i][j]=dp[i-1][j];
            }
        }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int[] val={15,14,10,45,30};
        int[] wt={2,5,1,3,4};
        int W=7;
        int[][] dp=new int[val.length+1][W+1];
        for (int[] row : dp) {
            Arrays.fill(row,-1);
        }
        int n=val.length;
        System.out.println(knapSack(val, wt, W, n,dp));
        System.out.println(knapSackTab(val, wt, W));
    }
}
