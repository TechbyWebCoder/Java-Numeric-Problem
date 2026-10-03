import java.util.Scanner;

public class J31_modular_exponentiation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        long a = sc.nextLong();

        System.out.print("Enter b: ");
        long b = sc.nextLong();

        System.out.print("Enter m: ");
        long m = sc.nextLong();

        long result = 1;

        a = a % m;

        // Binary Exponentiation
        while (b > 0) {

            // If b is odd
            if (b % 2 == 1) {
                result = (result * a) % m;
            }

            // Square the base
            a = (a * a) % m;

            // Divide exponent by 2
            b = b / 2;
        }

        System.out.println("Result = " + result);

        sc.close();
    }
}
