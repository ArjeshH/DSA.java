public class SmallestDivisor {
    public static int sumByD(int[] arr,int d){
        int n=arr.length;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=Math.ceil((double)arr[i]/(double)d);
        }
        return sum;
    }
    public static int smallestDivisor(int[] arr,int th){
        int low=1;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        int high=max;
        while (low<=high) {
            int mid=(low+high)/2;
            if (sumByD(arr, mid)<=th) {
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        System.out.println(smallestDivisor(arr, limit));
    }
}
