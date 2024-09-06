public class MinNoOfCoins {
    public static int minNoOfCoins(int[] coins,int target){
        if (target==0) {
            return 0;
        }
        if (target<0) {
            return Integer.MAX_VALUE;
        }
        int mini=Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int ans=minNoOfCoins(coins, target-coins[i]);
            mini=Math.min(mini,1+ans);
        }
        return mini;
    }
    public static void main(String[] args) {
        int[] coins={1,10,20,50,5};
        System.out.println(minNoOfCoins(coins, 10));
    }
}
