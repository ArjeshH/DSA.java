public class FindPrefixSumMatrix {
    public static int findPrefixSumMatrix(int[][] arr,int l1,int l2,int r1,int r2){
        prefixSum(arr);
       int sum=0,leftSum=0,rightSum=0,upperLeftSum=0,res=0;
       sum=arr[l2][r2];
        leftSum=arr[l2][r1-1];
        rightSum=arr[l1-1][r2];
        upperLeftSum=arr[l1-1][r1-1];
        res= sum-leftSum-rightSum+upperLeftSum;
        return res;
       

    }
    public static void prefixSum(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                arr[i][j]+=arr[i][j-1];
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 1; j < arr.length; j++) {
                arr[j][i]+=arr[j-1][i];
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr={{1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1}};
       int res=findPrefixSumMatrix(arr, 2, 4, 3, 5);  
       System.out.println(res);          
    }
}
