public class MajorityElem {
    public static int majorityElem(int[] arr){
        int el=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if (cnt==0) {
                cnt=1;
                el=arr[i];
            }else if (el==arr[i]) {
                cnt++;
            }else{
                cnt--;
            }
        }
        int cnt1=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==el) {
                cnt1++;
            }

        }
        if (cnt1>(arr.length)/2) {
            return el;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,2,1,3,1,1,3,1,1};
        System.out.println(majorityElem(arr));
    }
}
