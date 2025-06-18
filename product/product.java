
import java.util.Scanner;

// import java.util.Scanner;
// class product {
//     public static int pro(int a, int b) {
//         int mul = a * b;
//         return mul;
//         // System.out.println(mul);
//     }
//     public static void main(String[] args) {
//         Scanner prdct = new Scanner(System.in);
//         int a = prdct.nextInt();
//         System.out.println("First number is : " + a);
//         int b = prdct.nextInt();
//         System.out.println("Second number is : " + b);
//         int mul = pro(a, b);
//         System.out.println(mul);
//     }
// }
class product {

    public static int productofaandb(int a, int b) {
        int mul = a * b;
        // System.out.println(mul);
        return mul;
    }

    public static void main(String[] args) {
        // productofaandb(5, 4);
        Scanner mult = new Scanner(System.in);
        System.out.println("Start now ");
        int c = mult.nextInt();
        System.out.println("Value of first number ::" + c);
        int d = mult.nextInt();
        System.out.println("Value of first number ::" + d);
        int multiply = productofaandb(c, d);
        System.out.println("Fianl output : " + multiply);

    }
}
