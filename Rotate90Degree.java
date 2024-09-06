import java.util.Arrays;

public class Rotate90Degree {
    public static void rotate(int[][] arr){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                swap(arr[i][j],arr[j][i]);
            }
        }
        // for (int i = 0; i < n; i++) {
        //     reverse(arr[i]);
        // }
    }

    // private static void reverse(int[] arr) {
    //     int left=0,right=arr.length-1;
    //     while (left<right) {
    //         swap(arr[left], arr[right]);
    //         left++;
    //         right--;
    //     }
    // }

    private static void swap(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},
                    {5,6,7,8},
                    {12,13,14,15},
                    {23,24,25,26}};
        rotate(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
