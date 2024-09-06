import java.util.Stack;

public class Celebrity {
    private static int celebrity(int[][] arr,int n){
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i <n; i++) {
            st.push(i);
        }
        while (st.size()>1) {
            int a=st.peek();
            st.pop();
            int b=st.peek();
            st.pop();
            if (knows(a,b,arr)) {
                st.push(b);
            }else{
                st.push(a);
            }}
            int ans=st.peek();
            boolean rowVal=false;
            int zeros=0;
            for (int i = 0; i < n; i++) {
                if (arr[ans][i]==0) {
                    zeros++;
                }
            }
            if (zeros==n) {
                rowVal=true;
            }
            
            boolean colval=false;
            int ones=0;
            for (int i = 0; i < n; i++) {
                if (arr[i][ans]==1) {
                    ones++;
                }
            }
            if (ones==n-1) {
                colval=true;
            }
            if (colval==true && rowVal==true) {
                return ans;
            }else return -1;
        }

    private static boolean knows(int a, int b, int[][] arr) {
        if (arr[a][b]==1) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr={{0,1,0},
                        {0,0,0},
                    {0,1,0}};
        System.out.println(celebrity(arr, arr.length));
    }
    }

