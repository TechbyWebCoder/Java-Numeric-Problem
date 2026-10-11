import java.util.Scanner;
import java.math.BigInteger;

public class J38_binomial_coefficient {

    static BigInteger calculateCombination(int n, int k) {

        if (k < 0 || k > n) {
            return BigInteger.ZERO;
        }

        k = Math.min(k, n - k);

        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= k; i++) {

            result = result.multiply(
                BigInteger.valueOf(n - i + 1)
            );

            result = result.divide(
                BigInteger.valueOf(i)
            );
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        if (n < 0) {
            System.out.println("N must be non-negative.");
        } else {
            BigInteger result = calculateCombination(n, k);

            System.out.println(
                "C(" + n + ", " + k + ") = " + result
            );
        }

        sc.close();
    }
}
