public class TargetSum2 {
    public static boolean solve(int[] arr,int sum){
        int n=arr.length;
        boolean[][] dp=new boolean[n+1][sum+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=true;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int v=arr[i-1];
                if (v<=j && dp[i-1][j-v]==true) {
                    dp[i][j]=true;
                }else if (dp[i-1][j]==true) {
                    dp[i][j]=true;
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5,7,8};
        System.out.println(solve(arr, 10));
    }
}
