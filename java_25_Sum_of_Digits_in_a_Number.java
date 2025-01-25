//import java.util.Scanner;
//
//public class java_25_Sum_of_Digits_in_a_Number {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number :");
//        int num = sc.nextInt();
//        int sum = 0;
//
//        while (num != 0){
//
//            int digit = num%10;  // Get the last digit of number
//            sum = sum + digit;
//            num = num /10; // Remove Last number from given number
//
//        }
//        System.out.println("Sum of Digits in Given Number :"+sum);
//
//    }
//}

public class java_25_Sum_of_Digits_in_a_Number{
    public static void main(String[] args) {
       StringRev("Onkar");
    }

    private static void StringRev(String str) {
        String reversed ="  ";

        for (int i = str.length()-1; i >=0; i--) {

          reversed =reversed+str.charAt(i);
        }
        System.out.println(reversed);
    }
}
