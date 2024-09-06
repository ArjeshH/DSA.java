import java.util.Arrays;

public class InfiniteArraySearch {
    public static int ans(int[] arr,int tar){
        int st=0;
        int ed=1;
        while (tar>arr[ed]) {
            int temp=ed+1;
             ed=ed+(ed-st+1)*2;
             st=temp;
        }
        return BS(arr, st, ed, tar);
    }
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
        int[] arr={1,2,3,4,5,6,7,9,6,4,24,648,3793,326498,269,3263490,254,3610};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(ans(arr, 269));
    }
}
