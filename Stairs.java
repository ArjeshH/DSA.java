public class Stairs {
    public static int ways(int n){
        if (n==0 || n==1) {
            return 1;
        }
        int left=ways(n-1);
        int right=ways(n-1);
        return left+right;
    }
    public static void main(String[] args) {
        System.out.println(ways(2));
    }
}
