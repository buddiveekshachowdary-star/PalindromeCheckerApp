public class PalindromeCheckerApp{
    public static void main(String[] args) {
        String text = "madam";

// Create stack
        java.util.Stack<Character> stack = new java.util.Stack<>();

// Push characters into stack
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        boolean isPalindrome = true;

// Pop characters and compare
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

// Print result
        if (isPalindrome) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is NOT a Palindrome");
        }
    }
}