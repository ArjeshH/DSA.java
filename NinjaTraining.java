import java.util.Arrays;

public class NinjaTraining {
    public static int maxPoints(int day,int last,int[][] points,int[][] dp){
        if (day==0) {
            for (int task = 0; task < 2; task++) {
                int maxi=0;
                if (task!=last) {
                    maxi=Math.max(points[0][task], maxi);
                }
                return maxi;
            }
        }
        if (dp[day][last]!=-1) {
            return dp[day][last];
        }
        int maxi=0;
        for(int task=0;task<2;task++){
            if (task!=last) {
                int point=points[day][task]+maxPoints(day-1, task, points,dp);
                maxi=Math.max(maxi, point);
            }
        }
        return dp[day][last]=  maxi;
    }
    public static int maxPointsTab(int day,int last,int[][] points){
        int[][] dp=new int[points.length][4];
        dp[0][0]=Math.max(points[0][1], points[0][2]);
        dp[0][1]=Math.max(points[0][0], points[0][2]);
        dp[0][2]=Math.max(points[0][1], points[0][0]);
        dp[0][3]=Math.max(points[0][1], Math.max(points[0][2], points[0][0]));
        for(day=1;day<points.length;day++){
            
            for(last=0;last<4;last++){
                dp[day][last]=0;
                for(int task=0;task<3;task++){
                    int point=points[day][last]+dp[day-1][last];
                    dp[day][last]=Math.max(dp[day][last], point);
                }   
            }
        }
        return dp[points.length-1][3];

    }
    public static void main(String[] args) {
        int[][] arr={{1,2,5},{3,1,1},{3,3,3}};
        int[][] dp=new int[arr.length][4];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
            }
        }
        System.out.println(maxPoints(arr.length-1, 3, arr,dp));
        System.out.println();
        System.out.println(maxPointsTab(0, 0, dp));
    }
}
