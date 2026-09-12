import java.util.Scanner;

public class J12_spy_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        int product = 1;
        int temp = n;

        // Calculate sum and product of digits
        while (temp != 0) {
            int digit = temp % 10;

            sum += digit;
            product *= digit;

            temp /= 10;
        }

        // Check Spy Number
        if (sum == product) {
            System.out.println(n + " is a Spy Number.");
        } else {
            System.out.println(n + " is not a Spy Number.");
        }

        sc.close();
    }
}
