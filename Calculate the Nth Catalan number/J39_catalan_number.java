import java.util.Scanner;
import java.math.BigInteger;

public class J39_catalan_number {

    static BigInteger findCatalan(int n) {

        BigInteger catalan = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {

            catalan = catalan.multiply(
                BigInteger.valueOf(2L * (2L * i - 1))
            );

            catalan = catalan.divide(
                BigInteger.valueOf(i + 1L)
            );
        }

        return catalan;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("N must be non-negative.");
        } else {
            System.out.println(
                "Catalan Number C(" + n + ") = " + findCatalan(n)
            );
        }

        sc.close();
    }
}
