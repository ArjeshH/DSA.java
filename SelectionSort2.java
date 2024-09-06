public class SelectionSort2 {
    public static void selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int last=arr.length-1-i;
            int maxIdx=max(arr,0,last);
            swap(arr,maxIdx,last);
        }
    }
    public static void insertionSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j =i+1; j>0; j--) {
                if (arr[j]<arr[j-1]) {
                    swap(arr, j-1, j);
                }else{
                    break;
                }
                
            }
            
        }
    }
    public static int max(int[] arr,int first,int last)
    {
        int max=first;
        for (int i = first; i <= last; i++) {
            if (arr[first]<arr[i]) {
                max=i;
                
            }
            
        }
        return max;
    }
    public static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        // int[] arr={12,-12,36,-90,349};
        int[] arr={1,55};
        // selectionSort(arr);
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
