import java.util.Scanner;

public class java_13_GretestElement_inArray {
    public static void main(String[] args) {

        greatestNumber();
    }

    static void greatestNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Elements in Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

        }
        System.out.println("Maximum element is :" + max);
    }
}
