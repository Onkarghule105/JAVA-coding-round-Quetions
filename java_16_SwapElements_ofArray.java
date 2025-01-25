import java.util.Arrays;

public class java_16_SwapElements_ofArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 3, 18};

        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));

        swap(arr,0,5);
        System.out.println(Arrays.toString(arr));


    }
    static void swap(int[] arr,int index1, int index2){

        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2]=temp;

    }
}
