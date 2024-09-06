public class TransPoseSquare {
    public static void trsnsPose(int[][] arr,int r,int c){
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    static void reverse(int[] arr){
        int l=0;
        int r=arr.length-1;
        while (l<r) {
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public static void rotatedMatrix(int[][] arr,int n){
        trsnsPose(arr, n, n);
        for (int i = 0; i < n; i++) {
            reverse(arr[i]);
        }
    }
    public static void print(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
                    //  print(arr);
        // trsnsPose(arr, arr.length, arr[0].length);  
        print(arr);
        rotatedMatrix(arr, arr.length);
        print(arr);

    }
}
