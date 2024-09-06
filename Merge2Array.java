public class Merge2Array {
    private static void merge(int[] arr1,int[] arr2,int n,int m){
        int len=n+m;
        int gap=len/2+len%2;
        while (gap>0) {
            int left=0;
            int right=left+gap;
            while (right<len) {
                if (left<n&& right>=n) {
                    swapIfGreater(arr1, arr2, left, right-n);
                }else if (left>=n) {
                    swapIfGreater(arr2, arr2,left-n, right-n);
                }else{
                    swapIfGreater(arr1, arr1,left, right);
                }
                left++;
                right++;
            }
            if (gap==1) {
                break;
            }
            gap=gap/2+gap%2;

            
        }
    }

    private static void swapIfGreater(int[] arr1, int[] arr2, int i, int j) {
      if (arr1[i]>arr2[j]) {
        int temp=arr1[i];
        arr1[i]=arr2[j];
        arr2[j]=temp;
      }  
    }
    public static void main(String[] args) {
        
        int[] arr1 = {1, 4, 8, 10};
        int[] arr2 = {2, 3, 9};
        merge(arr1, arr2, arr1.length, arr2.length);
        for (int i : arr1) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : arr2) {
            System.out.print(i+" ");
        }
    }
}
