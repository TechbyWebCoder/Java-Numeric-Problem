import java.util.Scanner;

public class J26_twin_primes {

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

        System.out.print("Enter L: ");
        int L = sc.nextInt();

        System.out.print("Enter R: ");
        int R = sc.nextInt();

        System.out.println("Twin prime pairs from " + L + " to " + R + ":");

        for (int i = L; i <= R - 2; i++) {

            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }

        sc.close();
    }
}
