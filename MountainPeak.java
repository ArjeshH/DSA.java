public class MountainPeak {
    public static int peak(int[] arr){
        int st=0;
        int ed=arr.length-1;
        while (st<ed) {
            int mid=st+(ed-st)/2;
            if (arr[mid]>arr[mid+1]) {
                ed=mid;
            }else{
                st=mid+1;
            }
        }
        return arr[st];
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,2,1};
        System.out.println(peak(arr));
    }
}
