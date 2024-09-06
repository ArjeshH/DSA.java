public class MaxSubarraySum {
    public static int maxSubarraySum(int[] arr){
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j < n; j++) {
                sum+=arr[j];
                max=Math.max(sum, max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={-1,-3,-5,0,8,3,7,-1,-6,8,3};
        System.out.println(maxSubarraySum(arr));
    }
}
