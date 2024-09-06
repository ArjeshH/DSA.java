public class FirstOcc {
    public static int firstOcc(int[] arr,int x)
    {
        int st=0;
        int n=arr.length;
        int end=n-1;
        
        int fo=-1;
        while (st<=end) {
            int mid=st+(end-st)/2;
            if (arr[mid]==x) {
                fo=mid;
                end=mid-1;
            }else if (arr[mid]<x) {
                st=mid+1;
            }else{
                end=mid-1;
            }
            
        }
        return fo;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,4,5,6,6,7};
        System.out.println(firstOcc(arr, 2));
    }
}
