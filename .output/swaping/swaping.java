
import java.util.Scanner;

public class swaping {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = : " + a);

        System.out.println("b = : " + b);
    }

    public static void main(String[] args) {

        Scanner swapp = new Scanner(System.in);
        System.out.println("THE SWAPING START");
        int c = swapp.nextInt();
        int d = swapp.nextInt();

        swap(c, d);

    }

}
