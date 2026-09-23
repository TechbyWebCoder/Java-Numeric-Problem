import java.util.Scanner;

public class J22_number_of_divisors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                count++;
            }
        }

        System.out.println("Total number of divisors of " + n + " = " + count);

        sc.close();
    }
}
