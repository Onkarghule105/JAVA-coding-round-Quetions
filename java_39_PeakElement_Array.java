import java.util.Scanner;

public class java_39_PeakElement_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        System.out.println("Enter the Array Elements:");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans =  FindPeakElement(arr,n);
        System.out.println("Index of a peak point is "+ans);


    }

    private static int FindPeakElement(int[] arr, int n) {
        if (n == 1){
            return 0;
        }
        if (arr[0]>=arr[1]){
            return 0;
        }
        if (arr[arr.length-1]>=arr[arr.length-2]){
            return arr.length-1;
        }

        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                return i;
            }
        }
            return 0;
    }

}
