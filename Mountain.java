public class Mountain {
    public static int peak(int[] arr,int n){
        int s=0;
        int e=n-1;
        int mid=(e+s)/2;
        while (s<e) {
            if (arr[mid]<arr[mid+1]) {
                s=mid+1;
            }else{
                e=mid;
            }
            mid=(s+e)/2;
        }
        return s;
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,5,3,2};
        System.out.println(peak(arr, arr.length));
    }
}
