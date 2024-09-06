public class Search2Dmatrix {
    public static boolean search(int[][] arr,int target){
        int n=arr.length;
        int m=arr[0].length;
        int rows=0,col=m-1;
        while (rows<n && col>=0) {
            if (arr[rows][col]==target) {
                return true;
            }else if (arr[rows][col]<target) {
                rows++;
            }else{
                col--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr={{1,4,7,11,15},
    {2,5,8,12,19},
{3,6,9,16,22},
{10,13,14,17,24},
{18,21,23,26,30}};
System.out.println(search(arr, 142));
    }
}
