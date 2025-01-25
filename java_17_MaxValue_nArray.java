public class java_17_MaxValue_nArray {
    public static void main(String[] args) {

        int[] arr= {2, 3, 51, 7, 18, 23,};

        System.out.println(maxnumber(arr));


    }

    static int maxnumber(int[] arr) {
        int maxValue= arr[0];

        for (int i = 1; i <arr.length ; i++) {
            if (  arr[i] > maxValue){
                maxValue = arr[i];
            }

        }
        return maxValue;
    }
}
