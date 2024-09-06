public class Maze {
    public static int mazeMem(int i,int j,int[][]dp){
        
        if (i==0 && j==0) {
            return 1;
        }
        if (i<0 || j<0) {
            return 0;
        }
        if (dp[i][j]!=-1) {
            return dp[i][j];
        }
        int left=mazeMem(i, j-1, dp);
        int up=mazeMem(i-1, j, dp);
        return dp[i][j]=left+up;


    }
    public static int mazeTab(int i,int j){
        int[][] dp=new int[i+1][j+1];
        for (int k = 0; k < dp.length; k++) {
            for (int k2 = 0; k2 < dp[0].length; k2++) {
                if (k==0 && k2==0) {
                    dp[k][k2]=1;
                }else{
                    int left=0,up=0;
                    if(k2>0) { left=dp[k][k2-1];}
                    if(k>0){  up=dp[k-1][k2];}
                    dp[k][k2]=left+up;
                }
            }
        }
        return dp[i][j];
    }
    public static void main(String[] args) {
        int n=5;
        int m=6;
        int[][] dp=new int[n][m];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
            }
        }
        System.out.println(mazeMem(n-1, m-1, dp));
        System.out.println();
        System.out.println(mazeTab(n-1, m-1));
    }
}
