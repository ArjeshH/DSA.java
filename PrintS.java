import java.util.ArrayList;

public class PrintS {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,3,5,3,2,1};
        int n=arr.length-1;
        // ArrayList<Integer> list =new ArrayList<>();
        int sum=4;
        int res=printS(0,0,arr,sum,n);
        System.out.println(res);
    }

    private static int printS(int idx, int s, int[] arr, int sum,int n) {
        if (s>sum) {
            return 0;
        }
        if (idx==n) {
            if (s==sum) {
                
                return 1;
            }
            return 0;
        }
        s+=arr[idx];
        
        int l=printS(idx+1, s, arr, sum, n);
        s-=arr[idx];
        
        int r=printS(idx+1, s, arr, sum, n);
        return l+r;
        
    }
}
