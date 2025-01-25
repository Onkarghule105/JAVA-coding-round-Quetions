import java.util.Scanner;

public class java_26_Largest_Sum_In_Sub_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 7, -4, 3, 2, -10, 9, 1};
        System.out.println(largestSubArray(arr));
    }

     static int largestSubArray(int[] arr) {
        int maxSum = 0;
        int currentSum = 0;

         for (int i = 0; i <arr.length ; i++) {
             currentSum = currentSum + arr[i];
             if (currentSum > maxSum) {
                 maxSum = currentSum;

             }
             if (currentSum<0){
                 maxSum = 0;
             }

         }
            return maxSum;
    }
}
