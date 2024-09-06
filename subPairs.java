public class subPairs {
    public static void main(String[] args) {
        int[] arr={4,5,76,70,8,9};
        // prinbtSubArray(arr);
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }
    }
    private static void prinbtSubArray(int[] arr) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i; j < arr.length; j++) {
                currSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                // for(int k=i;k<=j;k++){
                //     // System.out.print(arr[k]+" ");
                //     currSum+=arr[k];
                // }

                    if (currSum>maxSum) {
                        maxSum=currSum;
                    }
                // System.out.println();
            }
        }
        System.out.println(maxSum);
    }
}
