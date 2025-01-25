//Greatest of two numbers
import java.util.Scanner;

public class java_5_GreatestOF_TwoNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the Number 1 :");
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();
        System.out.println("Enter the Number 2 :");
        int num2= sc.nextInt();

        if (num1>num2){
            System.out.println("Number 1 is Greater");
        }else {
            System.out.println("Number 2 is Greater");

        }


    }
}
