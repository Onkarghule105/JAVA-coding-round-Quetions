import java.util.Scanner;

public class java_15_ArrayTwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n= sc.nextInt();
        int[] nums=new int[n];

        System.out.println("Enter the elements of Array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target=9;
        int count=0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {

                if(nums[i]+nums[j]==target){
                    count++;

                    System.out.println(nums[i]+"+"+nums[j]+"+"+"= "+target);
                }

            }

        } //Total Number of pairs
        System.out.println(" Total number of Pairs:"+count);

    }
}
