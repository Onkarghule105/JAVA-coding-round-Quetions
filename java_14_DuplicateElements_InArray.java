public class java_14_DuplicateElements_InArray {
    public static void main(String[] args) {

        duplicateElement();
    }

    private static void duplicateElement() {

        int[] arr={2,3,4,5,3,2,4,1,6,7};
        System.out.println("Duplicate Elements are: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    System.out.print(arr[i]);


                }

            }

        }

    }
}
