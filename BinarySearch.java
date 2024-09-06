public class BinarySearch {
    
    private static int binarySearch(int[] arr,int low,int high,int target){
        int mid=(low+high)/2;
        if (arr[mid]==target) {
            return mid;
        }
        while (low<=high) {
            
        
        if (arr[mid]<target) {
           return binarySearch(arr, mid+1, high, target);
        }else {
            return binarySearch(arr, low,mid-1, target);
        }
    }
    return -1;
    }
    private static int search(int[] arr,int target){
        return binarySearch(arr,0, arr.length-1, target);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(arr, 16));
    }
}
