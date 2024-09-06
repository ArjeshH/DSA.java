public class BSrec {
    public static int BS(int[] arr,int s,int e,int tar){
       
        int mid=s+(e-s)/2;
        if (s>e) {
            return -1;
        }
        if (arr[mid]==tar) {
            return mid;
        }
        if (arr[mid]<tar) {
            return BS(arr, mid+1, e, tar);
        }else{
           return BS(arr, s, mid-1, tar);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(BS(arr, 0, arr.length-1, 6));
        
    }
}
