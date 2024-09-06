public class MergeSort2 {
    public static void mergeSort(int[] arr,int si,int ei)
    {
        if (si>=ei) {
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr, si,mid);
        mergeSort(arr,mid+1, ei);
        merge(arr,si,mid,ei);
    }

    private static void merge(int[] arr, int si, int mid, int ei) {
        int i=si;
        int j=mid+1;
        int k=0;
        int[] temp=new int[ei-si+1];
        while (i<=mid && j<=ei) {
            if (arr[i]<arr[j]) {
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }

        }
        while (i<=mid) {
            temp[k++]=arr[i++];
        }
        while (j<=ei) {
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int[] arr={12,24,57,24,18,27};
        mergeSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
