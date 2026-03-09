public class PalindromeCheckerApp{
    public static void main(String[] args) {
        String text = "A man a plan a canal Panama";

// Normalize the string: remove spaces and convert to lowercase
        String normalized = text.replaceAll("\\s+", "").toLowerCase();

// Reverse the normalized string
        String reversed = "";
        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed += normalized.charAt(i);
        }

// Check palindrome
        if (normalized.equals(reversed)) {
            System.out.println("\"" + text + "\" is a Palindrome (ignoring spaces & case)");
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome (ignoring spaces & case)");
        }
    }
}