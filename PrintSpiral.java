public class PrintSpiral {
    public static void printSpiral(int[][] arr,int r,int c){
        int ur=0;
        int br=r-1;
        int lc=0;
        int rc=c-1;
        int count=0;
        while (count<r*c) {
            for(int j=lc;j<=rc && count<r*c;j++ ){
                System.out.print(arr[ur][j]+" ");
                count++;
            }
            ur++;
            for(int j=ur;j<=br &&count<r*c;j++){
                System.out.print(arr[j][rc]+" ");
            }
            rc--;
            for(int j=rc;j>=lc && count<r*c;j--){
                System.out.print(arr[br][j]+" ");
            }
            br--;
            for(int j=br;j>=ur && count<r*c;j--){
                System.out.print(arr[j][lc]+" ");
            }
            lc++;
        }
    }
    public static void main(String[] args) {
        int[][]arr= {{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                    {13,14,15,16}};
        // printSpiral(arr, arr.length, arr[0].length);             
        int r=4;
        int c=4;
        printSpiral(arr, r, c);
    }
}
