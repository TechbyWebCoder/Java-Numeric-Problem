import java.util.Scanner;

public class J28_kth_prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        // Estimate an upper limit
        int limit;

        if (k < 6) {
            limit = 15;
        } else {
            limit = (int) (k * (Math.log(k) + Math.log(Math.log(k)))) + 10;
        }

        boolean[] isPrime = new boolean[limit + 1];

        // Assume all numbers are prime
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes
        for (int i = 2; i * i <= limit; i++) {

            if (isPrime[i]) {

                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        int kthPrime = 0;

        for (int i = 2; i <= limit; i++) {

            if (isPrime[i]) {
                count++;

                if (count == k) {
                    kthPrime = i;
                    break;
                }
            }
        }

        System.out.println("The " + k + "th prime number is: " + kthPrime);

        sc.close();
    }
}
