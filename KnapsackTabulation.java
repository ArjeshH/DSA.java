public class KnapsackTabulation {
    static int knapSackTab(int[] val,int[] wt,int w)
    {
        int n=val.length;
        int[][] dp=new int[n+1][w+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=0;
        }
        for (int i = 0; i < w+1; i++) {
            dp[0][i]=0;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < w+1; j++) {
                int v=val[i-1];
                int we=wt[j-1];
                if(we<=j){
                int incPrt=v+dp[i-1][j-we];
                int exPrt=dp[i-1][j];
                dp[i][j]=Math.max(incPrt, exPrt);

                }
                dp[i][j]=dp[i-1][j];
            }
            
        }
        return dp[n][w];
    }
    public static void main(String[] args) {
        int[] val={10,25,17,27,58};
        int[] wt={2,5,3,1,4};
        System.out.println(knapSackTab(val, wt, 8));
    }

}
