import java.util.Scanner;

public class J33_modular_inverse {

    static int[] extendedGCD(int a, int b) {

        if (b == 0) {
            return new int[]{a, 1, 0};
        }

        int[] result = extendedGCD(b, a % b);

        int gcd = result[0];
        int x1 = result[1];
        int y1 = result[2];

        int x = y1;
        int y = x1 - (a / b) * y1;

        return new int[]{gcd, x, y};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = sc.nextInt();

        System.out.print("Enter M: ");
        int m = sc.nextInt();

        int[] result = extendedGCD(a, m);

        int gcd = result[0];
        int x = result[1];

        if (gcd != 1) {
            System.out.println("Multiplicative inverse does not exist.");
        } else {

            // Make the inverse positive
            int inverse = (x % m + m) % m;

            System.out.println("Multiplicative inverse of "
                    + a + " modulo " + m + " = " + inverse);
        }

        sc.close();
    }
}
