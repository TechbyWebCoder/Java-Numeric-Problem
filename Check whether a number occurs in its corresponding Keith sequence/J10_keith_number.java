import java.util.Scanner;

public class J10_keith_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;

        // Count number of digits
        int digits = String.valueOf(n).length();

        int[] sequence = new int[digits];

        // Store the digits
        int temp = n;

        for (int i = digits - 1; i >= 0; i--) {
            sequence[i] = temp % 10;
            temp /= 10;
        }

        boolean isKeith = false;

        while (true) {

            int sum = 0;

            // Sum the previous digits/terms
            for (int i = 0; i < digits; i++) {
                sum += sequence[i];
            }

            // Check if original number occurs
            if (sum == original) {
                isKeith = true;
                break;
            }

            // If sequence has passed the original number
            if (sum > original) {
                break;
            }

            // Shift terms to the left
            for (int i = 0; i < digits - 1; i++) {
                sequence[i] = sequence[i + 1];
            }

            sequence[digits - 1] = sum;
        }

        if (isKeith) {
            System.out.println(original + " is a Keith Number.");
        } else {
            System.out.println(original + " is not a Keith Number.");
        }

        sc.close();
    }
}
