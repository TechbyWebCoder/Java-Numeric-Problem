import java.util.Scanner;

public class J37_last_nonzero_factorial {

    static int[] lastDigit = {1, 1, 2, 6, 4};

    static int findLastNonZeroDigit(int n) {

        if (n < 5) {
            return lastDigit[n];
        }

        int result = 1;

        while (n > 0) {
            result = (result * lastDigit[n % 5]) % 10;

            if (n >= 5) {
                result = (result * 2) % 10;
            }

            n /= 5;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            System.out.println(
                "Last non-zero digit of N!: " +
                findLastNonZeroDigit(n)
            );
        }

        sc.close();
    }
}
