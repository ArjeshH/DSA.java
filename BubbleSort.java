public class BubbleSort {
    public static void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
             boolean flag=false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    flag=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
                
                
            }
            if (!flag) {
                return;
            }
           
            
        }
        display(arr);
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minPos=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minPos]<arr[j]) {
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
            
        }
        display(arr);
    }

    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={5,3,2,4,1};
        bubbleSort(arr);
        // display(arr);
        System.out.println();
        selectionSort(arr);
    }
}
