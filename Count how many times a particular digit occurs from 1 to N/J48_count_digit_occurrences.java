import java.util.Scanner;

public class J48_count_digit_occurrences {

    static long countOccurrences(int n, int d) {

        long count = 0;

        for (int i = 1; i <= n; i++) {

            int num = i;

            while (num > 0) {

                int digit = num % 10;

                if (digit == d) {
                    count++;
                }

                num /= 10;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.print("Enter digit D (0-9): ");
        int d = sc.nextInt();

        if (n < 1 || d < 0 || d > 9) {
            System.out.println("Enter N >= 1 and a digit from 0 to 9.");
        } else {
            System.out.println(
                "Occurrences of digit " + d + ": "
                + countOccurrences(n, d)
            );
        }

        sc.close();
    }
}
