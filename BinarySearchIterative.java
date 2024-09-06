public class BinarySearchIterative {
    public static boolean binarySearch(int[] arr,int target){
        int st=0;
        int n=arr.length;
        int end=n-1;
        
        while (st<=end) {
            int mid=(st+end)/2;
            if (arr[mid]==target) {
                return true;
            }else if (arr[mid]<target) {
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;


    }
public static boolean binarySearchRecursive(int[] arr,int st,int end,int target)
{
    if (st>end) {
        return false;
    }
    int mid=(st+end)/2;
    if (arr[mid]==target) {
        return true;
    }else if (arr[mid]<target) {
        return binarySearchRecursive(arr, mid+1, end, target);
    }else{
        return binarySearchRecursive(arr, st,mid-1, target);
    }
}
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        // System.out.println(binarySearch(arr, 5));
        boolean a=binarySearch(arr, 1);
        System.out.println(a);
        System.out.println(binarySearchRecursive(arr, 0, arr.length-1, 3));
    }
}
