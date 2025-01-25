import java.util.Scanner;

public class java_2_PostiveOR_NegativeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        if (number>0){
            System.out.println("Number is Positive");

        } else if (number<0) {
            System.out.println("Number is Negative");

        }else {
            System.out.println("Number is Zero");

        }
    }
}
