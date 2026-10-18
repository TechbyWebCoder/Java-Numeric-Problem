import java.util.Scanner;

public class J43_huge_number_division {

    // Removes leading zeros from a number.
    static String removeLeadingZeros(String num) {

        int i = 0;

        while (i < num.length() - 1 && num.charAt(i) == '0') {
            i++;
        }

        return num.substring(i);
    }

    // Compares two non-negative integer strings.
    // Returns 1 if a > b, 0 if equal, and -1 if a < b.
    static int compare(String a, String b) {

        a = removeLeadingZeros(a);
        b = removeLeadingZeros(b);

        if (a.length() > b.length()) {
            return 1;
        }

        if (a.length() < b.length()) {
            return -1;
        }

        int result = a.compareTo(b);

        if (result > 0) {
            return 1;
        }

        if (result < 0) {
            return -1;
        }

        return 0;
    }

    // Subtracts b from a, assuming a >= b.
    static String subtract(String a, String b) {

        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int borrow = 0;

        while (i >= 0) {

            int digitA = a.charAt(i) - '0' - borrow;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            if (digitA < digitB) {
                digitA += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result.append(digitA - digitB);

            i--;
            j--;
        }

        return removeLeadingZeros(result.reverse().toString());
    }

    static String[] divide(String dividend, String divisor) {

        dividend = removeLeadingZeros(dividend);
        divisor = removeLeadingZeros(divisor);

        if (divisor.equals("0")) {
            throw new ArithmeticException("Division by zero");
        }

        StringBuilder quotient = new StringBuilder();
        String remainder = "0";

        for (int i = 0; i < dividend.length(); i++) {

            // Bring down the next digit.
            remainder = removeLeadingZeros(
                remainder + dividend.charAt(i)
            );

            int quotientDigit = 0;

            // Find the next quotient digit (0 through 9).
            while (compare(remainder, divisor) >= 0) {
                remainder = subtract(remainder, divisor);
                quotientDigit++;
            }

            quotient.append(quotientDigit);
        }

        return new String[] {
            removeLeadingZeros(quotient.toString()),
            removeLeadingZeros(remainder)
        };
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

        System.out.print("Enter dividend: ");
        String dividend = sc.nextLine().trim();

        System.out.print("Enter divisor: ");
        String divisor = sc.nextLine().trim();

        if (!isValidNumber(dividend) || !isValidNumber(divisor)) {
            System.out.println("Enter non-negative integers only.");
        } else if (removeLeadingZeros(divisor).equals("0")) {
            System.out.println("Division by zero is not allowed.");
        } else {
            String[] result = divide(dividend, divisor);

            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        sc.close();
    }
}
