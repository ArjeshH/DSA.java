public class EqualPartition {
    static int arrSum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static boolean equalPartition(int[] arr){
        int totSum=arrSum(arr);
        int preSum=0;
        for (int i = 0; i < arr.length; i++) {
            preSum+=arr[i];
            int sufSum=totSum-preSum;
            if (preSum==sufSum) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(equalPartition(arr));
    }
}
