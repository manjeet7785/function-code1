
import java.util.Scanner;

public class binomialcoeff {

    public static int factorial(int n) {
        int v = 1;
        for (int i = 1; i <= n; i++) {
            v = v * i;

        }
        return v;
    }

    public static int binocoff(int a, int b) {
        int one = factorial(a);
        int second = factorial(b);
        int third = factorial(a - b);
        int binocoff = one / (second * third);
        return binocoff;

    }

    public static void main(String[] args) {
        Scanner mul = new Scanner(System.in);
        int first = mul.nextInt();
        int second = mul.nextInt();

        int g = binocoff(first, second);
        System.out.println(g);

    }
}
