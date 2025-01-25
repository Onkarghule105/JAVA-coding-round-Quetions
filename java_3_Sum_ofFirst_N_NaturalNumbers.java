import java.util.Scanner;

public class java_3_Sum_ofFirst_N_NaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        for (int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("Sum of the Numbers Is:"+sum);

    }
}
