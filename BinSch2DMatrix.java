public class BinSch2DMatrix {
    private static boolean binSearch(int[][] arr,int target){
        int n=arr.length;
        int m=arr[0].length;
        int low=0;
        int high=n*m-1;
        while (low<=high) {
            int mid=(low+high)/2;
            int row=mid/m;
            int col=mid%m;
            if (arr[row][col]==target) {
                return true;
            }
            else if (arr[row][col]<target) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] mat={{1,2,3,4,5},
                    {6,7,8,9,10},
                    {11,12,13,14,15}};
       System.out.println(binSearch(mat, 115));             

    }
}
