import java.util.Scanner;

public class J11_neon_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;
        int sum = 0;
        int temp = square;

        // Calculate sum of digits of square
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        // Check Neon Number
        if (sum == n) {
            System.out.println(n + " is a Neon Number.");
        } else {
            System.out.println(n + " is not a Neon Number.");
        }

        sc.close();
    }
}
