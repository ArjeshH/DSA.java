import java.util.*;

public class ThreeSome {
    public static ArrayList<ArrayList<Integer>> threeSome(int[] arr){
        Arrays.sort(arr);
        
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for (int i = 0; i < arr.length-2; i++) {
            
            if (i==0|| (i>0 && arr[i]!=arr[i-1])) {
                int lo=i+1;
                int hi=arr.length-1;
                int sum=0-arr[i];
                while (lo<hi) {
                    ArrayList<Integer> list=new ArrayList<>();
                    if (arr[lo]+arr[hi]==sum) {
                        list.add(arr[i]);
                        list.add(arr[lo]);
                        list.add(arr[hi]);
                        ans.add(list);
                        while (lo<hi && arr[lo]==arr[lo+1]) {
                            lo++;
                        }
                        while (lo<hi&& arr[hi]==arr[hi-1]) {
                            hi--;
                        }
                        lo++;
                        hi--;
                    }else if (arr[lo]+arr[hi]<sum) {
                        lo++;
                    }else{
                        hi--;
                    }
                }

            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={-1,-1,-1,-2,0,0,4,2,1,1,5,-2,0-1,-4,-5,0};
        ArrayList<ArrayList<Integer>> list=threeSome(arr);
        System.out.println(list);
    }
}
