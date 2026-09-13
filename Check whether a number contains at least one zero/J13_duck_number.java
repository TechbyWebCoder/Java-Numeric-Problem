import java.util.Scanner;

public class J13_duck_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        boolean hasZero = false;

        while (temp != 0) {
            int digit = temp % 10;

            if (digit == 0) {
                hasZero = true;
                break;
            }

            temp /= 10;
        }

        if (hasZero) {
            System.out.println(n + " is a Duck Number.");
        } else {
            System.out.println(n + " is not a Duck Number.");
        }

        sc.close();
    }
}
