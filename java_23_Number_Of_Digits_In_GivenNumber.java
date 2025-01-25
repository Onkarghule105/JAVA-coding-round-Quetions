import java.util.Scanner;

public class java_23_Number_Of_Digits_In_GivenNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int count=0;

        while (num!=0){
            num = num/10;
            count++;
        }
        System.out.println("Number of Digits are :"+count);

    }
}
