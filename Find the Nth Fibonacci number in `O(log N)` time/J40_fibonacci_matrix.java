import java.util.Scanner;
import java.math.BigInteger;

public class J40_fibonacci_matrix {

    static BigInteger[] fibonacci(int n) {

        if (n == 0) {
            return new BigInteger[] {
                BigInteger.ZERO,
                BigInteger.ONE
            };
        }

        BigInteger[] pair = fibonacci(n / 2);

        BigInteger a = pair[0]; // F(k)
        BigInteger b = pair[1]; // F(k + 1)

        // F(2k) = F(k) * [2 * F(k + 1) - F(k)]
        BigInteger c = a.multiply(
            b.multiply(BigInteger.TWO).subtract(a)
        );

        // F(2k + 1) = F(k)^2 + F(k + 1)^2
        BigInteger d = a.multiply(a).add(b.multiply(b));

        if (n % 2 == 0) {
            return new BigInteger[] { c, d };
        } else {
            return new BigInteger[] {
                d,
                c.add(d)
            };
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("N must be non-negative.");
        } else {
            BigInteger result = fibonacci(n)[0];

            System.out.println(
                "Fibonacci number F(" + n + ") = " + result
            );
        }

        sc.close();
    }
}
