import java.util.Scanner;

public class J07_disarium_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        // Calculate sum of powered digits
        while (n != 0) {
            int digit = n % 10;

            sum += Math.pow(digit, digits);

            digits--;
            n /= 10;
        }

        // Check Disarium number
        if (sum == original) {
            System.out.println(original + " is a Disarium Number.");
        } else {
            System.out.println(original + " is not a Disarium Number.");
        }

        sc.close();
    }
}
