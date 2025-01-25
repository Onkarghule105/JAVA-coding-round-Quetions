import java.util.Scanner;

public class java_22_Palindrom_OR_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        int original_num =num;

        int rev=0;

        while (num!=0){
            rev = rev * 10+num%10;
            num = num/10;
        }

        if (original_num == rev) {
            System.out.println("Palindrom number"+"  "+original_num);
        }else {
            System.out.println(" Not Palindrom number"+"  "+original_num);

        }

    }
}
