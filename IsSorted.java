import java.util.ArrayList;;
public class IsSorted {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,7,8,9};
        // System.out.println(isSorted(arr, 0));
        // System.out.println(search(arr, 26, 0));
        // ArrayList<Integer> ans=new ArrayList<>();
        // System.out.println(find(arr, 0,26 , ans));
        // System.out.println(sLargest(arr));
        // System.out.println(sSmallest(arr));
        System.out.println(unique(arr));
    }
    static boolean isSorted(int[] arr,int idx){
        if (idx==arr.length-1) {
            return true;
        }
        return arr[idx]<arr[idx+1] && isSorted(arr, idx+1);
    }
    static boolean search(int[] arr,int tar,int idx){
        if (idx==arr.length) {
            return false;
        }
        return arr[idx]==tar || search(arr, tar, idx+1);
    }
    static ArrayList<Integer> find(int[] arr,int idx,int tar,ArrayList<Integer> list){
        if (idx==arr.length) {
            return list;
        }
        if (arr[idx]==tar) {
            list.add(idx);

        }
        return find(arr, idx+1, tar, list);
    }
    static int sLargest(int[] arr){
        int largest=arr[0];
        int slargest=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if (arr[i]>largest) {
                slargest=largest;
                largest=arr[i];
            }else if (arr[i]<largest && arr[i]>slargest) {
                slargest=arr[i];
            }
        }
        return slargest;
    }
    static int sSmallest(int[] arr){
        int smallest=arr[0];
        int sSmallest=Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<smallest) {
                sSmallest=smallest;
                smallest=arr[i];
            }else if (arr[i]>smallest && arr[i]<sSmallest) {
                sSmallest=arr[i];
            }
        }
        return sSmallest;
    }
    static int unique(int[] arr){
        int i=0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j]!=arr[i]) {
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
}
