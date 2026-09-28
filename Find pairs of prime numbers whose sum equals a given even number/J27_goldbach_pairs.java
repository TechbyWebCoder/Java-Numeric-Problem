import java.util.Scanner;

public class J27_goldbach_pairs {

    // Method to check whether a number is prime
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

        System.out.print("Enter an even number: ");
        int n = sc.nextInt();

        System.out.println("Prime pairs whose sum is " + n + ":");

        for (int i = 2; i <= n / 2; i++) {

            int j = n - i;

            if (isPrime(i) && isPrime(j)) {
                System.out.println("(" + i + ", " + j + ")");
            }
        }

        sc.close();
    }
}
