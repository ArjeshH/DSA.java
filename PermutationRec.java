import java.util.ArrayList;

public class PermutationRec {
    public static ArrayList<ArrayList<Integer>> permute(int[] arr){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        boolean[] freq=new boolean[arr.length];
        permute(arr,ds,ans,freq);
        return ans;
    }

    private static void permute(int[] arr, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> ans, boolean[] freq) {
        if (ds.size()==arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<freq.length;i++){
            if (!freq[i]) {
                freq[i]=true;
                ds.add(arr[i]);
                permute(arr, ds, ans, freq);
                ds.removeLast();
                freq[i]=false;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(permute(arr));
    }
}
