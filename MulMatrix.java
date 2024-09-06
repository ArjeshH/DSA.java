public class MulMatrix {
    public static void mulMatrix(int[] a,int[] b,int r1,int c1,int r2,int c2){
        if (c1!=r2) {
            System.out.println("Multiplication not Possible");
        }
        int[][] mul=new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j <c2; j++) {
                mul[i][j]=0;
                for (int k = 0; k<c1; k++) {
                    mul[i][j]+=(a[i][k]*b[k][j]);
                }
            }
        }
    }
}
