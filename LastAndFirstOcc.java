public class LastAndFirstOcc {
    public static int firstOcc(int[] arr,int k){
        int low=0;
        int high=arr.length-1;
        int first=-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if (arr[mid]==k) {
                first=mid;
                high=mid-1;
                
            }else if (arr[mid]<k) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return first;
    }
    public static int lastOcc(int[] arr,int k){
        int low=0;
        int high=arr.length-1;
        int last=-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if (arr[mid]==k) {
                last=mid;
                low=mid+1;
                
            }else if (arr[mid]<k) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return last;
    }
    public static int[] firstAndLastOcc(int[] arr,int k){
        int[] ans=new int[2];
        int first=firstOcc(arr, k);
        if (first==-1) {
            for (int i = 0; i < ans.length; i++) {
                ans[i]=-1;
            }
            return ans;
        }
        int last=lastOcc(arr, k);
        ans[0]=first;
        ans[1]=last;
        return ans;
    }
    public static void main(String[] args) {
        
    int key = 13;
    int[] v = {3,4,13,13,13,20,40};
    int[] res=firstAndLastOcc(v, key);
    for (int i : res) {
        System.out.print(i+" ");
    }
    // System.out.println(firstOcc(res, key));
    // }
}
}
