public class fibonacci {
    
        public static int fibonacci(int n,int[] fib)
        {
            if (n==1 || n==0) {
                return n;
            }
            fib[n]=fibonacci(n-1, fib)+fibonacci(n-2, fib);
            return fib[n];
        }
        public static int fibTabulation(int n)
        {
            int[] dp=new int[n+1];
            dp[1]=1;
            for (int i = 2; i <=n; i++) {
                dp[i]=dp[i-1]+dp[i-2];
            }
            return dp[n];
        }
        public static void main(String[] args) {
            int n=10;
            int[] fib=new int[n+1];
            // int res=fibonacci(n, fib);
            int res=fibTabulation(n);

            System.out.println(res);
    
        }
    }
    

