public class MaxOptimaized {
    public static int maxOpt(int[] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if (max<sum) {
                max=sum;
            }
            if (sum<0) {
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={-1,-3,-5,0,8,3,7,-1,-6,8,3};
        System.out.println(maxOpt(arr));
    }
}
