package String3;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        boolean hasSpace = false;

        if (password.length() >= 8 && password.length() <= 15) {
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);

                if (c >= 'A' && c <= 'Z') {
                    hasUpper = true;
                } else if (c >= 'a' && c <= 'z') {
                    hasLower = true;
                } else if (c >= '0' && c <= '9') {
                    hasDigit = true;
                } else if (c == '@' || c == '#' || c == '$' || c == '%' || c == '^' || c == '&' || c == '+') {
                    hasSpecial = true;
                } else if (c == ' ') {
                    hasSpace = true;
                }
            }

            if (hasUpper && hasLower && hasDigit && hasSpecial && !hasSpace) {
                System.out.println(password + " is a valid password");
            } else {
                System.out.println(password + " is an invalid password");
            }
        } else {
            System.out.println(password + " is an invalid password");
        }
    }
}
