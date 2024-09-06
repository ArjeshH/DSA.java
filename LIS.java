import java.util.Arrays;
import java.util.HashSet;

public class LIS {
    private static int lis(int[] arr1){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        int[] arr2=new int[set.size()];
        int i=0;
        for (int s : set) {
            arr2[i]=s;
            i++;
            
        }
        Arrays.sort(arr2);
        return lcs(arr1,arr2);
    }

    private static int lcs(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        int[][] dp=new int[n+1][m+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j]=0;
        }
        for (int i=1; i <= n; i++) {
            for (int j = 1; j <=m; j++) {
                if (arr1[i-1]==arr2[j-1]) {
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        int[] arr1={1,35,26,16,49,14,35,14};
        int res=lis(arr1);
        System.out.println(res);
    }
}
