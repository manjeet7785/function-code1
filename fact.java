
import java.util.Scanner;

public class fact {

    public static void factorial(int n) {
        int v = 1;
        for (int i = 1; i < n; i++) {
            v = v * i;

        }
        System.out.println(v);

    }

    public static void main(String[] args) {
        Scanner mul = new Scanner(System.in);
        int first = mul.nextInt();
        // int second = mul.nextInt();
        // Swapab(first, second);
        factorial(first);
    }
}
