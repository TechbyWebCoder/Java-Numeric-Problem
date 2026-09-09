import java.util.Scanner;

public class SmithNumber {

    // Calculate sum of digits
    static int digitSum(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    // Check whether number is prime
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Smith number must be composite
        if (n < 4 || isPrime(n)) {
            System.out.println(n + " is not a Smith Number.");
            sc.close();
            return;
        }

        int originalSum = digitSum(n);
        int factorSum = 0;
        int temp = n;

        // Find prime factors
        for (int i = 2; i <= temp; i++) {

            while (temp % i == 0) {
                factorSum += digitSum(i);
                temp /= i;
            }
        }

        if (originalSum == factorSum) {
            System.out.println(n + " is a Smith Number.");
        } else {
            System.out.println(n + " is not a Smith Number.");
        }

        sc.close();
    }
}
