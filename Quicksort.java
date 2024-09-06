public class Quicksort {
    public static void quickSort(int[] arr,int si,int ei)
    {
        if (si>=ei) {
            return;
        }
        int pIdx=partition(arr,si,ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }

    private static int partition(int[] arr, int si, int ei) {
       int i=si-1;
       int pivot=arr[ei];
       
       for (int j = si; j <ei; j++) {
        i++;
            if (arr[j]<=pivot) {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }

       }
       i++;
       int temp=pivot;
       arr[ei]=arr[i];
       arr[i]=temp;
       return i;
    }
    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={12,37,26,16,278,37};
        display(arr);
        quickSort(arr, 0, arr.length-1);
        display(arr);
        
    }
}
