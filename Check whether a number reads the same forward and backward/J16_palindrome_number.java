import java.util.Scanner;

public class J16_palindrome_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int reverse = 0;

        // Reverse the number
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        // Check palindrome
        if (original == reverse) {
            System.out.println(original + " is a Palindrome Number.");
        } else {
            System.out.println(original + " is not a Palindrome Number.");
        }

        sc.close();
    }
}
