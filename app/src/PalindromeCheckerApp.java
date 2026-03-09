public class PalindromeCheckerApp{
    public static void main(String[] args) {
        // Create instance of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Test strings
        String text1 = "Madam";
        String text2 = "Hello";

        // Use the checkPalindrome() method
        if (checker.checkPalindrome(text1)) {
            System.out.println("\"" + text1 + "\" is a Palindrome");
        } else {
            System.out.println("\"" + text1 + "\" is NOT a Palindrome");
        }

        if (checker.checkPalindrome(text2)) {
            System.out.println("\"" + text2 + "\" is a Palindrome");
        } else {
            System.out.println("\"" + text2 + "\" is NOT a Palindrome");
        }
    }
}

// ================= PalindromeChecker Class =================
class PalindromeChecker {

    // Encapsulated method to check palindrome
    public boolean checkPalindrome(String text) {
        if (text == null || text.isEmpty()) return false;

        // Normalize text: remove spaces and convert to lowercase
        String normalized = text.replaceAll("\\s+", "").toLowerCase();

        // Use char array to check palindrome
        char[] chars = normalized.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}