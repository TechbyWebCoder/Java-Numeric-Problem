import java.util.Scanner;

public class J44_huge_number_palindrome {

    static boolean isPalindrome(String num) {

        int left = 0;
        int right = num.length() - 1;

        while (left < right) {

            if (num.charAt(left) != num.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
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
        } else if (isPalindrome(num)) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

        sc.close();
    }
}
