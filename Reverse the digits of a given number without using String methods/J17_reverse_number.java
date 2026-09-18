import java.util.Scanner;

public class J17_reverse_number {

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

        System.out.println("Original Number: " + original);
        System.out.println("Reverse Number: " + reverse);

        sc.close();
    }
}
