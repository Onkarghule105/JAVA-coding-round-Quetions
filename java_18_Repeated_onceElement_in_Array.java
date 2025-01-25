public class java_18_Repeated_onceElement_in_Array {
    public static void main(String[] args) {
        int[] arr={2, 3, 5, 3, 1, 1};

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]+"Is repeated");

                }else {

                }

            }  System.out.println(arr[i]+"Not Repeated");

        }

    }
}
