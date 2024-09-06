public class Floor {
    public static char ceil(char[] arr,int st,int ed,char tar){
        st=0;ed=arr.length-1;
        
        while (st<=ed) {
            int mid=st+(ed-st)/2;
             if (arr[mid]>tar) {
                ed=mid-1;
            }else{
            st=mid+1;}
     }
     return arr[st%arr.length];

    }
    public static void main(String[] args) {
        char[] arr={'A','B','C','D','E','F','G','H','I','J'};
        System.out.println(ceil(arr, 0, arr.length-1, 'F'));
    }
}
