public class java_30_Smallest_Latter {
    public static void main(String[] args) {
        char[] arr = {'c','f','j','k','m','p'};
        char target = 'j';
       char ans =  smallestLatter(arr,target);
        System.out.println(ans);
    }

    static char smallestLatter(char[] arr,char target) {
        int start = 0;
        int end = arr.length - 1;

        //find mid
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid -1;
            }
            else{
                start = mid+ 1;
            }
        }
        return arr[start%arr.length];
    }
}
