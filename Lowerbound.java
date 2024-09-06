public class Lowerbound {
    private static int lb(int[] arr,int n,int target)
    {
        int ans=n;
        int low=0;
        int high=arr.length-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if (arr[mid]>target) {
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(lb(arr, arr.length, 7));
    }
}
