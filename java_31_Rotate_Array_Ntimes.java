import java.util.Arrays;

public class java_31_Rotate_Array_Ntimes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,};
        int n = 1;
        System.out.println(Arrays.toString(rotateArray(arr, n)));

    }

     static int[]  rotateArray(int[] arr, int n) {
        int temp = arr[0];
         for (int i = 1; i < n; i++) {
             arr[i-1] = arr[i];
         }
         arr[n-1] = temp;
         return arr;
    }
}
