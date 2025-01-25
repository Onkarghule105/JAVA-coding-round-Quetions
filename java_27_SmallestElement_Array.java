
import java.util.Arrays;
public class java_27_SmallestElement_Array {
    public static void main(String[] args) {
        int[] arr = {2,5,7,4,7,1,12};
        System.out.println(SmallestElement(arr));
    }
    static int SmallestElement(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
        }
        return arr[0];
    }
}
