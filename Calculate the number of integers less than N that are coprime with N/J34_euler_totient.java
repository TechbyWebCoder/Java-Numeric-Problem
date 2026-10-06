import java.util.Scanner;

public class J34_euler_totient {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int result = n;
        int temp = n;

        // Find prime factors and apply Euler's formula
        for (int p = 2; p * p <= temp; p++) {

            if (temp % p == 0) {

                // Remove all occurrences of p
                while (temp % p == 0) {
                    temp = temp / p;
                }

                result = result - result / p;
            }
        }

        // If temp is greater than 1, it is a prime factor
        if (temp > 1) {
            result = result - result / temp;
        }

        System.out.println("Euler's Totient of " + n + " = " + result);

        sc.close();
    }
}
