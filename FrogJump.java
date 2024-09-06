public class FrogJump {
    public static int MinEg(int[] arr,int n){
        if (n==0) {
            return 0;
        }
        int left=MinEg(arr, n-1)+Math.abs(arr[n]-arr[n-1]);
        int right=0;
        if (n>1) {
             right=MinEg(arr, n-1)+Math.abs(arr[n]-arr[n-2]);
        }
        
        
        return Math.min(right, left);
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,30,40,60};
        System.out.println(MinEg(arr, arr.length-1));
    }
}
