import java.util.Scanner;

public class J29_prime_gap {

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

                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int previousPrime = -1;
        int largestGap = 0;
        int firstPrime = 0;
        int secondPrime = 0;

        for (int i = 2; i <= n; i++) {

            if (isPrime[i]) {

                if (previousPrime != -1) {

                    int gap = i - previousPrime;

                    if (gap > largestGap) {
                        largestGap = gap;
                        firstPrime = previousPrime;
                        secondPrime = i;
                    }
                }

                previousPrime = i;
            }
        }

        if (previousPrime == -1 || previousPrime == 2) {
            System.out.println("Not enough prime numbers to find a gap.");
        } else {
            System.out.println("Largest prime gap up to " + n + " = " + largestGap);
            System.out.println("Between " + firstPrime + " and " + secondPrime);
        }

        sc.close();
    }
}
