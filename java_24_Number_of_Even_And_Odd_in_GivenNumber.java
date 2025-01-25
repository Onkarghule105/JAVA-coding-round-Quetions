import java.util.Scanner;

public class java_24_Number_of_Even_And_Odd_in_GivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int even = 0;
        int odd = 0;
        while (num!=0){
            int digit =num%10; //Get the last digit of Number.
            if (digit%2==0){
                even++;
            }else {
                odd++;
            }
            num = num / 10; // Removes last digit from the number

        }
        System.out.println("Total Even numbers:"+even+"\n"+"Total odd numbers:"+odd);

    }
}
