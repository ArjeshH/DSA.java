public class TotalRodLength {
    public static int totalRodLength(int[] length,int[] price,int rodL)
    {
        int n=price.length;
        int[][] dp=new int[n+1][rodL+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i==0 || j==0) {
                    dp[i][j]=0;
                }
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < rodL+1;j++) {
                if (length[i-1]<=rodL) {
                    dp[i][j]= Math.max(price[i-1]+dp[i][rodL-length[i-1]],dp[i-1][rodL]);
                }
                else{
                    dp[i][j]= dp[i-1][rodL];
                }
            }
            
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j]+" ");
                
            }
            System.out.println();
            
        }
        return dp[n][rodL];
    }
    public static void main(String[] args) {
        int[] length={1,2,3,4,5,6,7,8};
        int[] price={1,5,8,9,10,17,17,20};
        System.out.println(totalRodLength(length, price, 8));
    }
}
