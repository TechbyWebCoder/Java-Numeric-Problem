import java.util.Scanner;

public class J14_sunny_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int number = n + 1;
        int sqrt = (int) Math.sqrt(number);

        if (sqrt * sqrt == number) {
            System.out.println(n + " is a Sunny Number.");
        } else {
            System.out.println(n + " is not a Sunny Number.");
        }

        sc.close();
    }
}
