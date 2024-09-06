import java.util.ArrayList;

public class SwapAlternate {
    public static void swapAlt(int[] arr){
        for(int i=0;i<arr.length;i+=2){
            if (i+1<arr.length-1) {
                swap(arr,i,i+1);
            }
        }
    }
public static int uniqueElem(int[] arr){
    int res=0;
    for(int i=0;i<arr.length;i++){
        res=res^arr[i];
    }
    return res;
}
    private static void swap(int[] arr,int i,int j) {
        int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
    }
    public static ArrayList<Integer> intersection(int[] arr1,int n,int[] arr2,int m){
        int i=0,j=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while (i<n && j<m) {
            if (arr1[i]<arr2[j]) {
                i++;
            }else if (arr1[i]==arr2[j]) {
                ans.add(arr1[i]);
                i++;
                j++;
            }else{
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // int[] arr={1,2,3,4,5,6,7,8,9};
        // int[] arr1={1,1,3,3,7,7,8,8,9};
        // swapAlt(arr);
        // for (int i : arr) {
        //     System.out.print(i+" ");
        //    
        // }
        // System.out.println(uniqueElem(arr1));
        int[] arr1={1,2,3,4,5,5,6,6,7,8};
        int[] arr2={2,2,5,5,6,7,8};
        System.out.println(intersection(arr1, arr1.length, arr2, arr2.length));
    }
}
