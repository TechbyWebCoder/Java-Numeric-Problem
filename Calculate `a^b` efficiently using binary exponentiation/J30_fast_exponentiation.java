import java.util.Scanner;

public class J30_fast_exponentiation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (a): ");
        long a = sc.nextLong();

        System.out.print("Enter exponent (b): ");
        long b = sc.nextLong();

        long result = 1;

        long base = a;
        long exponent = b;

        // Binary Exponentiation
        while (exponent > 0) {

            // If exponent is odd
            if (exponent % 2 == 1) {
                result = result * base;
            }

            // Square the base
            base = base * base;

            // Divide exponent by 2
            exponent = exponent / 2;
        }

        System.out.println(a + "^" + b + " = " + result);

        sc.close();
    }
}
