import java.util.Scanner;

class Passwordchecker{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String password = scanner.nextLine();
        int result = isValidPassword(password);
        System.out.println(result);
    }
    public static int isValidPassword(String password) {
        if (password.length() < 8) {
            return 0;
        }
        boolean hasUppercase = false, hasLowercase = false, hasDigit = false, hasSpecialChar = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (isSpecialCharacter(ch)) {
                hasSpecialChar = true;
            }
        }

        if (password.contains(" ")) {
            return 0;
        }

        return (hasUppercase && hasLowercase && hasDigit && hasSpecialChar) ? 1 : 0;
    }

    public static boolean isSpecialCharacter(char ch) {
        String specialCharacters = "!@#$%^&*()-+=<>?/[]{}_";
        return specialCharacters.contains(String.valueOf(ch));
    }
}
