
import java.util.Scanner;

public class swap {

    public static void Swapab(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args) {
        Scanner mul = new Scanner(System.in);
        int first = mul.nextInt();
        int second = mul.nextInt();
        Swapab(first, second);
    }

}
