import java.util.Scanner;

public class J45_huge_number_reverse {

    static String reverseNumber(String num) {

        StringBuilder reversed = new StringBuilder();

        for (int i = num.length() - 1; i >= 0; i--) {
            reversed.append(num.charAt(i));
        }

        return reversed.toString();
    }

    static boolean isValidNumber(String num) {

        if (num.isEmpty()) {
            return false;
        }

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) < '0' || num.charAt(i) > '9') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a very large number: ");
        String num = sc.nextLine().trim();

        if (!isValidNumber(num)) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            String reversed = reverseNumber(num);

            System.out.println("Original Number: " + num);
            System.out.println("Reversed Number: " + reversed);
        }

        sc.close();
    }
}
