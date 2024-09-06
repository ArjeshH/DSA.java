public class aggessiveCows {
    public static boolean isPossible(int[] stalls,int distance,int cows){
        int cntCw=1; int last=stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i]-last>=distance) {
                cntCw++;
                last=stalls[i];
            }
        }
        if (cntCw>=cows) {
            return true;
        }
        return false;
    }
    public static int AggessiveCows(int[] stalls,int k){
        int n=stalls.length;
        int low=1;
        int high=stalls[n-1]-stalls[0];
        while (low<=high) {
            int mid=(low+high)/2;
            if (isPossible(stalls, mid, k)) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        int[] stalls={0,3,4,7,9,10};
        System.out.println(AggessiveCows(stalls, 4));
    }
}
