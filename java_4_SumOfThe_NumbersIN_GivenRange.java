import java.util.Scanner;

public class java_4_SumOfThe_NumbersIN_GivenRange {
    public static void main(String[] args){
        System.out.println("Enter the First Number:");
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        System.out.println("Enter the second Number:");
        int num2= sc.nextInt();
        int sum=0;

        for (int i=num1;i<=num2;i++){
            sum+=i;
        }

        System.out.println("Sum is:"+sum);

    }
}
