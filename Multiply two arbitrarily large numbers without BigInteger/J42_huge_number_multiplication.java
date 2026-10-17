import java.util.Scanner;

public class J42_huge_number_multiplication {

    static String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int n = num1.length();
        int m = num2.length();

        int[] result = new int[n + m];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                int product = digit1 * digit2;
                int sum = product + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        StringBuilder answer = new StringBuilder();

        int i = 0;

        while (i < result.length && result[i] == 0) {
            i++;
        }

        while (i < result.length) {
            answer.append(result[i]);
            i++;
        }

        return answer.toString();
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

        System.out.print("Enter first number: ");
        String num1 = sc.nextLine().trim();

        System.out.print("Enter second number: ");
        String num2 = sc.nextLine().trim();

        if (!isValidNumber(num1) || !isValidNumber(num2)) {
            System.out.println(
                "Please enter non-negative integers only."
            );
        } else {
            String product = multiply(num1, num2);
            System.out.println("Product: " + product);
        }

        sc.close();
    }
}
