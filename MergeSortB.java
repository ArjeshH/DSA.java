public class MergeSortB {
    public static void mergeSort(int[] arr,int s,int e){
        if (s>=e) {
            return;
        }
        int mid=(s+e)/2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);
        merge(arr,s,mid,e);
    }

    private static void merge(int[] arr, int s, int mid, int e) {
        int l1=mid-s+1;
        int l2=e-mid;
        int[] left=new int[l1];
        int[] right=new int[l2];
        int k=0,idx1=0,idx2=0;
        while (idx1<l1) {
            left[idx1++]=arr[k++];
        }
        k=mid+1;
        while (idx2<l2) {
            right[idx2]=arr[k];
            idx2++;
            k++;
        }
        while (idx1<l1 && idx2<l2) {
            if (left[idx1]<right[idx2]) {
                arr[k++]=left[idx1++];
            }else{
                arr[k++]=right[idx2++];
            }
        }
        while (idx1<l1) {
            arr[k++]=left[idx1++];
        }
        while (idx2<l2) {
            arr[k++]=right[idx2++];
        }

    }
    public static void main(String[] args) {
        int[] arr={12,154,1,5,14,1,6,17,14,1278,34,256,734};
        mergeSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
