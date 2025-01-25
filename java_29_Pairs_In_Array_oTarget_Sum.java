public class java_29_Pairs_In_Array_oTarget_Sum {
    public static void main(String[] args) {
      //  int[] arr = {1, 5, 7, -1, 5};
       // int sum = 6;
        int[] arr = {2,5,17,-1};
        int sum = 7;
        findTargetSumPairs(arr, sum);
    }

    static void findTargetSumPairs(int[] arr, int sum) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
}
