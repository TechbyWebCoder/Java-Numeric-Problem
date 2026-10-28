import java.util.Scanner;

public class J49_sum_of_digits_range {

    static long sumOfDigits(int n) {

        long sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    static long rangeSum(int l, int r) {

        long total = 0;

        for (int i = l; i <= r; i++) {
            total += sumOfDigits(i);
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter L: ");
        int l = sc.nextInt();

        System.out.print("Enter R: ");
        int r = sc.nextInt();

        if (l < 0 || r < l) {
            System.out.println(
                "Please ensure 0 <= L <= R."
            );
        } else {
            System.out.println(
                "Total sum of digits: " + rangeSum(l, r)
            );
        }

        sc.close();
    }
}
