public class java_33_Second_Largest_Element {
    public static void main(String[] args) {
        int[] arr = {7, 8, 8, 1, 4, 3};
        System.out.println(SecondLargest(arr));
    }

    static int SecondLargest(int[] arr) {
        int largestElement = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        // Find the largest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestElement) {
                largestElement = arr[i];
            }
        }

        // Find the second largest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLarge && arr[i] < largestElement) {
                secondLarge = arr[i];
            }
        }
        if (secondLarge == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLarge;
    }
}
