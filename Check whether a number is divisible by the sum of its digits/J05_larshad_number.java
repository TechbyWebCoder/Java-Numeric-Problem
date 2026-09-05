import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        // Calculate sum of digits
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        // Check divisibility
        if (original % sum == 0) {
            System.out.println(original + " is a Harshad Number.");
        } else {
            System.out.println(original + " is not a Harshad Number.");
        }

        sc.close();
    }
}
