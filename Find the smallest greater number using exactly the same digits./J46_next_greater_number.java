import java.util.Scanner;

public class J46_next_greater_number {

    static String findNextGreater(String num) {

        char[] digits = num.toCharArray();
        int n = digits.length;

        // Step 1: Find the first digit smaller than
        // the digit immediately to its right.
        int i = n - 2;

        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        // No greater permutation exists.
        if (i < 0) {
            return "No greater number exists";
        }

        // Step 2: Find the rightmost digit greater than digits[i].
        int j = n - 1;

        while (digits[j] <= digits[i]) {
            j--;
        }

        // Step 3: Swap the two digits.
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Step 4: Reverse the suffix after index i.
        int left = i + 1;
        int right = n - 1;

        while (left < right) {
            temp = digits[left];
            digits[left] = digits[right];
            digits[right] = temp;

            left++;
            right--;
        }

        return new String(digits);
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

        System.out.print("Enter a number: ");
        String num = sc.nextLine().trim();

        if (!isValidNumber(num)) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            String result = findNextGreater(num);

            if (result.equals("No greater number exists")) {
                System.out.println(result);
            } else {
                System.out.println("Next greater number: " + result);
            }
        }

        sc.close();
    }
}
