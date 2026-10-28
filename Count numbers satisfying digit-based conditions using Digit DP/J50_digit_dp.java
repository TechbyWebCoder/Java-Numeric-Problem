
import java.util.Arrays;
import java.util.Scanner;

public class J50_digit_dp {

    static String digits;
    static long[][][] dp;

    static long count(int pos, int sumParity, int tight) {
        if (pos == digits.length()) {
            return sumParity == 0 ? 1 : 0;
        }

        if (dp[pos][sumParity][tight] != -1) {
            return dp[pos][sumParity][tight];
        }

        int limit = (tight == 1)
                ? digits.charAt(pos) - '0'
                : 9;

        long result = 0;

        for (int digit = 0; digit <= limit; digit++) {
            int newParity = (sumParity + digit) % 2;

            int newTight = (tight == 1 && digit == limit)
                    ? 1 : 0;

            result += count(pos + 1, newParity, newTight);
        }

        dp[pos][sumParity][tight] = result;
        return result;
    }

    static long countEvenDigitSum(long n) {
        if (n < 0) {
            return 0;
        }

        digits = Long.toString(n);
        dp = new long[digits.length()][2][2];

        for (long[][] a : dp) {
            for (long[] b : a) {
                Arrays.fill(b, -1);
            }
        }

        return count(0, 0, 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        long n = sc.nextLong();

        System.out.println(
            "Count of numbers with even digit sum: "
            + countEvenDigitSum(n)
        );

        sc.close();
    }
}
