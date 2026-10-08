import java.util.Scanner;

public class J36_trailing_zeros_factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int zeros = 0;

        while (n > 0) {
            n = n / 5;
            zeros += n;
        }

        System.out.println("Trailing zeros in N!: " + zeros);

        sc.close();
    }
}
