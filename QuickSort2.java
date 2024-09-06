public class QuickSort2 {
    public static void quickSort(int[] arr,int st,int end){
        if (st<end) {
            int pIdx=partition(arr,st,end);
            quickSort(arr, st,pIdx-1);
            quickSort(arr,pIdx+1, end);
        }
       
    }

    private static int partition(int[] arr, int st, int end) {
        int i=st;
        int j=end;
        int pivot=arr[st];
        while (i<j) {
            while (arr[i]<=pivot && i<end) {
                i++;
            }
            while (arr[j]>pivot && j>st) {
                j--;
            }
           if(i<j) swap(arr,i,j);

        }
        swap(arr,st,j);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={12,26,785,25,36,36,28,256};
       quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
