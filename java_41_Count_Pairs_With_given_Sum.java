import java.util.Scanner;

public class java_41_Count_Pairs_With_given_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array:");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int targetSum = sc.nextInt();
       int ans=  Helper(arr,targetSum);
        System.out.println(ans);

    }

     static int Helper(int[] arr,int targetSum) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j] == targetSum){
                    count++;
                }

            }

        }
        return count;

    }
}
