import java.util.Scanner;

public class J25_segmented_sieve {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter L: ");
        int L = sc.nextInt();

        System.out.print("Enter R: ");
        int R = sc.nextInt();

        // Find primes up to sqrt(R)
        int limit = (int) Math.sqrt(R);

        boolean[] isPrime = new boolean[limit + 1];

        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= limit; i++) {

            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Segment for numbers from L to R
        boolean[] segment = new boolean[R - L + 1];

        for (int i = 0; i < segment.length; i++) {
            segment[i] = true;
        }

        // Mark multiples of each prime
        for (int p = 2; p <= limit; p++) {

            if (isPrime[p]) {

                int start = Math.max(p * p, ((L + p - 1) / p) * p);

                for (int j = start; j <= R; j += p) {
                    segment[j - L] = false;
                }
            }
        }

        // 0 and 1 are not prime
        if (L == 0) {
            segment[0] = false;

            if (R >= 1) {
                segment[1] = false;
            }
        } else if (L == 1) {
            segment[0] = false;
        }

        System.out.println("Prime numbers from " + L + " to " + R + ":");

        for (int i = 0; i < segment.length; i++) {

            if (segment[i]) {
                System.out.print((L + i) + " ");
            }
        }

        sc.close();
    }
}
