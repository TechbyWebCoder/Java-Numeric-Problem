import java.util.Scanner;

public class J18_digital_root {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;

        // Repeat until a single digit remains
        while (n >= 10) {

            int sum = 0;

            while (n != 0) {
                int digit = n % 10;
                sum += digit;
                n /= 10;
            }

            n = sum;
        }

        System.out.println("Original Number: " + original);
        System.out.println("Digital Root: " + n);

        sc.close();
    }
}
