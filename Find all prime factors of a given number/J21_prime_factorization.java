import java.util.Scanner;

public class J21_prime_factorization {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;

        System.out.print("Prime factors of " + original + ": ");

        for (int i = 2; i <= n; i++) {

            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        sc.close();
    }
}
