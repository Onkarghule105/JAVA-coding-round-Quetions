import java.util.Scanner;

public class java_36_factorial_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n  = sc.nextInt();
        int fac = 1;
        for (int i=1;i<=n;i++){
            fac = fac*i;
        }
        System.out.println("Factorial of"+" "+n+" "+"is"+" "+fac);
    }
}
