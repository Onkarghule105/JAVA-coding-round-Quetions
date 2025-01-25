//Greatest of the Three numbers
import java.util.Scanner;

public class java_6_GreatestOF_ThreeNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2:");
        int num2 = sc.nextInt();
        System.out.println("Enter the number3:");
        int num3 = sc.nextInt();

        if (num1>num2){
            System.out.println("Number1 is Greater");
        } else if (num2>num3) {
            System.out.println("Number2 is Greater");
        }else{
            System.out.println("Number3 is Greater");
        }

    }
}
