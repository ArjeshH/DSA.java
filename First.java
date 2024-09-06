public class First {
    public static int[] firLst(int[] arr,int tar){
        int st=0;int ed=arr.length-1;
        int[] ans=new int[2];
        ans[0]=search(arr, st, ed, true, tar);
        ans[1]=search(arr, st, ed, false, tar);
        return ans;

    }
    public static int search(int[] arr,int st,int ed,boolean isFirst,int tar){
        int ans=-1;
        while (st<=ed) {
            int mid=st+(ed-st)/2;
            if (arr[mid]<tar) {
                st=mid+1;
            }else if (arr[mid]>tar) {
                ed=mid-1;
            }else{
                ans=mid;
                if (isFirst) {
                    ed=mid-1;
                }else{
                    st=mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,7,7,7,7,7,8,9};
        int[] ans=firLst(arr, 2);
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}
