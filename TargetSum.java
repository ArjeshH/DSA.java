public class TargetSum {
    static boolean targetSumTab(int[] val,int sum)
    {
        int n=val.length;
        boolean[][]dp=new boolean[n+1][sum+1];
        
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=true;
            
        }
        for (int i = 1; i <n+1; i++) {
            for (int j = 1; j <sum+1; j++) {
                if (val[i-1]<=sum && dp[i-1][j-val[i-1]]==true) {
                    dp[i][j]=true;
                }else if (dp[i-1][j]==true) {
                    dp[i][j]=true;
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int[] val={2,4,8,5,1,9,6};
        int sum=10;
        System.out.println(targetSumTab(val, sum));
    }
}
