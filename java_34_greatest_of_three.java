import java.util.Scanner;

public class java_34_greatest_of_three {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the first Second:");
        int num2 = sc.nextInt();
        System.out.println("Enter the first Third:");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1+" "+"is Greatest");

        } else if (num2 > num3 && num2 > num1) {
            System.out.println(num2+" "+"is Greatest");

        }else if (num3 > num1 && num3 > num2){
            System.out.println(num3+" "+"is Greatest");
        }else {
            System.out.println("All numbers are the same ");
        }


    }
}
