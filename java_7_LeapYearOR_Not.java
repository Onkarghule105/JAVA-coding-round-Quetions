import java.util.Scanner;

public class java_7_LeapYearOR_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year= sc.nextInt();

        if (year%400==0){
            System.out.println("Year is Leap");
        } else if (year%4==0 && year%100!=0) {
            System.out.println("Year is Leap");

        }else
            System.out.println("Year is not  Leap");

    }
}
