public class FloorCeil {
    public static int ceil(int[] arr,int st,int ed,int tar){
        st=0;ed=arr.length-1;
        if (tar>arr[ed]) {
            return -1;
        }
        while (st<=ed) {
            int mid=st+(ed-st)/2;
            if (arr[mid]<tar) {
                st=mid+1;
            }else if (arr[mid]>tar) {
                ed=mid-1;
            }else{
                return arr[mid];
            }
     }
     return arr[st];

    }
    public static int floor(int[] arr,int st,int ed,int tar){
        st=0;ed=arr.length-1;
        if (tar<arr[0]) {
            return -1;
        }
        while (st<=ed) {
            int mid=st+(ed-st)/2;
            if (arr[mid]<tar) {
                st=mid+1;
            }else if (arr[mid]>tar) {
                ed=mid-1;
            }else{
                return arr[mid];
            }
     }
     return arr[ed];

    }
    public static void main(String[] args) {
        int[] arr={10,11,12,13,14,15,16,17,22};
        System.out.println(floor(arr, 0, arr.length-1, 1)+","+ceil(arr, 0, arr.length-1, 1));
    }
}
