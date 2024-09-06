import java.util.Scanner;

public class PascalsTriangle {
    public static int[][] pascalsTriangle(int n){
        int[][] arr=new int[n][];
        for (int i = 0; i < n; i++) {
            arr[i]=new int[i+1];
            arr[i][0]=1;
            arr[i][i]=1;
            for(int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
            
        }
       
       return arr;
    }
    public static void print(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Enter the no of rows:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[][] res=pascalsTriangle(n);
        print(res);
        
    }
}
