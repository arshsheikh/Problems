import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        if (isPalindrome(input)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
        
        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        String reversed = new StringBuilder(str).reverse().toString();
        
        return str.equals(reversed);
    }
}
