import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {
    
    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()_+-=[]{}|;:,.<>?";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter password length: ");
        int length = scanner.nextInt();
        
        System.out.print("Enter password complexity (1-4): ");
        int complexity = scanner.nextInt();
        
        String password = generatePassword(length, complexity);
        System.out.println("Your password is: " + password);
    }
    
    private static String generatePassword(int length, int complexity) {
        String chars = LOWERCASE_CHARS;
        if (complexity >= 2) {
            chars += UPPERCASE_CHARS;
        }
        if (complexity >= 3) {
            chars += NUMBERS;
        }
        if (complexity == 4) {
            chars += SPECIAL_CHARS;
        }
        
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(chars.length());
            char randomChar = chars.charAt(randomIndex);
            password.append(randomChar);
        }
        return password.toString();
    }
}
