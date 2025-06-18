
import java.util.*;

public class pro {

    public static void Productab(int a, int b) {
        int result = a * b;
        System.out.println(result);

    }

    public static void main(String[] args) {
        Scanner mul = new Scanner(System.in);
        int first = mul.nextInt();
        int second = mul.nextInt();
        Productab(first, second);
    }

}
