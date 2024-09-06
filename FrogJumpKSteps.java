public class FrogJumpKSteps {
    public static int minEgKSteps(int[] arr,int n,int steps){
        if (n==0) {
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for (int i = 1; i <= steps; i++) {
            if (n-i>0) {
                int ans=minEgKSteps(arr,n-i, steps)+Math.abs(arr[n]-arr[n-i]);
                min=Math.min(min,ans);
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr={10,20,40,60,20,30,40,10};
        System.out.println(minEgKSteps(arr, arr.length-1, 4));
    }
}
