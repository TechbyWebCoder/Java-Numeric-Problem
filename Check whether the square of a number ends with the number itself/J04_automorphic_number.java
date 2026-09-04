import java.util.Scanner;

public class J04_automorphic_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;

        // Check whether square ends with the original number
        if (square % (int) Math.pow(10, String.valueOf(n).length()) == n) {
            System.out.println(n + " is an Automorphic Number.");
        } else {
            System.out.println(n + " is not an Automorphic Number.");
        }

        sc.close();
    }
}
