import java.util.Scanner;

public class J08_happy_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;

        while (n != 1 && n != 4) {
            int sum = 0;

            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        if (n == 1) {
            System.out.println(original + " is a Happy Number.");
        } else {
            System.out.println(original + " is not a Happy Number.");
        }

        sc.close();
    }
}
