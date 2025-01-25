import java.util.Scanner;
/*
public class java_40_0s_1s_2s_Sorting_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the size of the array
        System.out.println("Enter the Array size:");
        int n = sc.nextInt();

        // Declare an array of size 'n'
        int[] arr = new int[n];

        // Input for the array elements (only 0's, 1's, and 2's)
        System.out.println("Enter the Array of Only 0's, 1's and 2's:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        sort012(arr);

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Function to sort the array of 0's, 1's and 2's using the Dutch National Flag algorithm
    static void sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        int temp;

        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap arr[low] and arr[mid]
                temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                // Swap arr[mid] and arr[high]
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}

 */
public class java_40_0s_1s_2s_Sorting_Array{
    public static void main(String[] args) {
        
    }
}