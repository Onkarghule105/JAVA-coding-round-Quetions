import java.util.Scanner;

public class java_10_SwapTwoNumbers_WithoutUsinggThirdVariable {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number1:");
        int num1= sc.nextInt();
        System.out.println("Enter the number2:");

        int num2= sc.nextInt();

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swaping number1:"  +num1);
        System.out.println("After swaping number2:"  +num2);


    }
}
