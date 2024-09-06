public class EditDistance {
    private static int editDistance(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int[][] dp=new int[n+1][m+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=i;
        }
        for (int j= 0; j< dp[0].length; j++) {
            dp[0][j]=j;
        }
        for (int i = 1; i <n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if (str1.charAt(i-1)==str2.charAt(j-1)) {
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]))+1;
                }
            }
        }
        return dp[n][m];

    }
    public static void main(String[] args) {
        String str1="predguwydgewyugtty";
        String str2="kethqegdqydgty";
        System.out.println(editDistance(str1, str2));
    }
}
