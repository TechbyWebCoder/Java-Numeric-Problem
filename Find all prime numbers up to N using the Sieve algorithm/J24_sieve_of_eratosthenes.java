import java.util.Scanner;

public class J24_sieve_of_eratosthenes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        boolean[] isPrime = new boolean[n + 1];

        // Assume all numbers are prime
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes
        for (int i = 2; i * i <= n; i++) {

            if (isPrime[i]) {

                // Mark multiples as non-prime
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.println("Prime numbers up to " + n + ":");

        for (int i = 2; i <= n; i++) {

            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
