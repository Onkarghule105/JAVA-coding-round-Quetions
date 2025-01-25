import java.util.Arrays;

public class java_28_LargestElement_Array {
    public static void main(String[] args) {
        int[] arr = {2,5,7,4,7,1,12};
        System.out.println( LargestElement(arr));
    }
     static int LargestElement(int[] arr) {
         Arrays.sort(arr);
         int n = arr.length;
         for (int i = 0; i <n ; i++) {
         }
         return arr[n-1];  //print last element
    }
}
