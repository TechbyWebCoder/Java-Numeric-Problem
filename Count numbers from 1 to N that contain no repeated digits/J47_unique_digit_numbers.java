import java.util.Scanner;

public class J47_unique_digit_numbers {

    static boolean hasUniqueDigits(int n) {

        boolean[] seen = new boolean[10];

        while (n > 0) {

            int digit = n % 10;

            if (seen[digit]) {
                return false;
            }

            seen[digit] = true;
            n /= 10;
        }

        return true;
    }

    static int countNumbers(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (hasUniqueDigits(i)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("N must be positive.");
        } else {
            System.out.println(
                "Count of numbers with no repeated digits: "
                + countNumbers(n)
            );
        }

        sc.close();
    }
}
