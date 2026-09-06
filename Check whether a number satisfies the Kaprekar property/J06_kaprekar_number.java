import java.util.Scanner;

public class J06_kaprekar_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;

        // Count number of digits
        int digits = String.valueOf(n).length();

        int divisor = (int) Math.pow(10, digits);

        // Split square into two parts
        int right = square % divisor;
        int left = square / divisor;

        // Check Kaprekar property
        if (left + right == n) {
            System.out.println(n + " is a Kaprekar Number.");
        } else {
            System.out.println(n + " is not a Kaprekar Number.");
        }

        sc.close();
    }
}
