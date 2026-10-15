import java.util.Scanner;

public class J41_huge_number_addition {

    static String addNumbers(String num1, String num2) {

        StringBuilder result = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int digit1 = 0;
            int digit2 = 0;

            if (i >= 0) {
                digit1 = num1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                digit2 = num2.charAt(j) - '0';
                j--;
            }

            int sum = digit1 + digit2 + carry;

            result.append(sum % 10);
            carry = sum / 10;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String num1 = sc.nextLine().trim();

        System.out.print("Enter second number: ");
        String num2 = sc.nextLine().trim();

        if (!isValidNumber(num1) || !isValidNumber(num2)) {
            System.out.println("Please enter non-negative integers only.");
        } else {
            String sum = addNumbers(num1, num2);
            System.out.println("Sum: " + sum);
        }

        sc.close();
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
}
