import java.util.Scanner;

public class J35_chinese_remainder {

    // Find modular inverse using Extended Euclidean Algorithm
    static int modularInverse(int a, int m) {

        int originalM = m;
        int x0 = 0;
        int x1 = 1;

        while (a > 1) {

            int quotient = a / m;

            int temp = m;
            m = a % m;
            a = temp;

            temp = x0;
            x0 = x1 - quotient * x0;
            x1 = temp;
        }

        if (x1 < 0) {
            x1 += originalM;
        }

        return x1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first remainder: ");
        int r1 = sc.nextInt();

        System.out.print("Enter first modulus: ");
        int m1 = sc.nextInt();

        System.out.print("Enter second remainder: ");
        int r2 = sc.nextInt();

        System.out.print("Enter second modulus: ");
        int m2 = sc.nextInt();

        int M = m1 * m2;

        int M1 = M / m1;
        int M2 = M / m2;

        int inv1 = modularInverse(M1, m1);
        int inv2 = modularInverse(M2, m2);

        int x = (r1 * M1 * inv1 + r2 * M2 * inv2) % M;

        if (x < 0) {
            x += M;
        }

        System.out.println("Solution: x = " + x);
        System.out.println("All solutions: x ≡ " + x + " (mod " + M + ")");

        sc.close();
    }
}
