public class UnBoundedKnapSack {
    public static int unBoundedKnapSack(int[] val,int[] wt,int w)
    {
        int n=val.length;
        int[][] dp=new int[n+1][w+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=0;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i]=0;
        }
        for (int i = 1; i <n+1; i++) {
            for (int j = 1; j < w+1; j++) {
                if (wt[i-1]<=j ) {
                    int incCn=val[i-1]+dp[i-1][j-wt[i-1]];
                    int exCn=dp[i-1][j];
                    dp[i][j]=Math.max(incCn, exCn);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][w];
    }
    public static void main(String[] args) {
        int[] val={10,20,21,47,58};
        int[] wt={2,4,5,1,3};
        System.out.println(unBoundedKnapSack(val, wt, 8));
    }
}
