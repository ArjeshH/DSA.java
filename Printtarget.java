import java.util.ArrayList;

public class Printtarget {
    public static ArrayList<ArrayList<Integer>> targetSum(int[] arr,int target){
        int idx=0;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        targetSum(idx,arr,target,ans,new ArrayList<Integer>());
        return ans;
    }

    private static void targetSum(int idx,int[] arr, int target, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> arrayList) {
        if (idx==arr.length) {
            if (target==0) {
                ans.add(new ArrayList<>(arrayList));
            }
            return;
        }
        if (arr[idx]<=target) {
        arrayList.add(arr[idx]);
        targetSum(idx, arr, target-arr[idx], ans, arrayList);
        arrayList.remove(arrayList.size()-1);
        }
        
        targetSum(idx+1, arr, target, ans, arrayList);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int target=7;
        ArrayList<ArrayList<Integer>> res=targetSum(arr, target);
        System.out.println(res);
    }
}
