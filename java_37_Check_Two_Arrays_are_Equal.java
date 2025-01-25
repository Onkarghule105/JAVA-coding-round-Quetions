import java.util.Arrays;

public class java_37_Check_Two_Arrays_are_Equal {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,10};
        int[] b= {1,2,3,4,10};

        boolean status = Arrays.equals(a,b);
        if (status==true){
            System.out.println("Arrays are equals");
        }else {
            System.out.println("Arrays are not equal");
        }
    }
}
