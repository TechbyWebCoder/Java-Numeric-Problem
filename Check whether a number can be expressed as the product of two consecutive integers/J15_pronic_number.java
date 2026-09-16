import java.util.Scanner;

public class J15_pronic_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPronic = false;

        for (int i = 0; i * (i + 1) <= n; i++) {

            if (i * (i + 1) == n) {
                isPronic = true;
                break;
            }
        }

        if (isPronic) {
            System.out.println(n + " is a Pronic Number.");
        } else {
            System.out.println(n + " is not a Pronic Number.");
        }

        sc.close();
    }
}
