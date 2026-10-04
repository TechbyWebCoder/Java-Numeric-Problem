import java.util.Scanner;

public class J32_extended_euclidean {

    static int[] extendedGCD(int a, int b) {

        if (b == 0) {
            return new int[]{a, 1, 0};
        }

        int[] result = extendedGCD(b, a % b);

        int gcd = result[0];
        int x1 = result[1];
        int y1 = result[2];

        int x = y1;
        int y = x1 - (a / b) * y1;

        return new int[]{gcd, x, y};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = sc.nextInt();

        System.out.print("Enter B: ");
        int b = sc.nextInt();

        int[] result = extendedGCD(a, b);

        int gcd = result[0];
        int x = result[1];
        int y = result[2];

        System.out.println("GCD = " + gcd);
        System.out.println("X = " + x);
        System.out.println("Y = " + y);

        System.out.println(
            a + " × " + x + " + " + b + " × " + y + " = " + gcd
        );

        sc.close();
    }
}
