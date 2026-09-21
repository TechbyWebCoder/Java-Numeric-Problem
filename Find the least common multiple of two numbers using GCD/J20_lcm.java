import java.util.Scanner;

public class J20_lcm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int originalA = a;
        int originalB = b;

        // Find GCD using Euclid's Algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;

        // Find LCM using GCD
        int lcm = (originalA * originalB) / gcd;

        System.out.println("LCM of " + originalA + " and " + originalB + " = " + lcm);

        sc.close();
    }
}
