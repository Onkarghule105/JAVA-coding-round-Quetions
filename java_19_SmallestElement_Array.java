public class java_19_SmallestElement_Array {
    public static void main(String[] args) {
        int[] arr={18, 12, 3, -7, 1, 4};
       int result =  minElement(arr);
        System.out.println(result);
      //  System.out.println( minElement(arr));

    }
    static int minElement(int[] arr){
        int ans = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
