import java.util.Scanner;

public class PrefixSum {
    public static int[] prefixSum(int[] arr){
        int n=arr.length;
        for (int i = 1; i <n; i++) {
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {

        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        System.out.println("Enter the array elements:");
        for (int i = 1; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int[] prefixSum=prefixSum(arr);
        System.out.println("Enter the no of queries:");
        int q=sc.nextInt();
        while (q-->0) {
            System.out.println("Enter the range:");
            int l=sc.nextInt();
            int r=sc.nextInt();
           int ans=prefixSum[r]-prefixSum[l-1];
           System.out.println(ans);
        }
    }
}
