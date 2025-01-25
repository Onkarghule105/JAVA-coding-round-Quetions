import java.util.Random;

public class java_35_Random_Number_Generate {
    public static void main(String[] args) {

        // Approach 1
        Random r = new Random();
        int rand = r.nextInt(10);
        System.out.println(rand);

        // Approach 2
        System.out.println(Math.random());

    }
}
