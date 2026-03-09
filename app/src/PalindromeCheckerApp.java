public class PalindromeCheckerApp{
    public static void main(String[] args) {
        String text = "madam";

        // Choose strategy: 1 - Stack, 2 - Deque (simulate using arrays)
        int choice = 1; // change to 2 for deque-style check

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        boolean result = strategy.isPalindrome(text);

        if (result) {
            System.out.println("\"" + text + "\" is a Palindrome using " + strategy.getClass().getSimpleName());
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome using " + strategy.getClass().getSimpleName());
        }
    }
}

// ================= Strategy Interface =================
interface PalindromeStrategy {
    boolean isPalindrome(String text);
}

// ================= Stack Strategy (using array) =================
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String text) {
        int n = text.length();
        char[] stack = new char[n];
        int top = -1;

        // Push characters onto stack
        for (int i = 0; i < n; i++) {
            stack[++top] = text.charAt(i);
        }

        // Pop characters and compare
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) != stack[top--]) {
                return false;
            }
        }

        return true;
    }
}

// ================= Deque Strategy (using array) =================
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String text) {
        int n = text.length();
        char[] deque = new char[n];
        int front = 0;
        int rear = n - 1;

        // Fill array
        for (int i = 0; i < n; i++) {
            deque[i] = text.charAt(i);
        }

        // Compare front and rear
        while (front < rear) {
            if (deque[front++] != deque[rear--]) {
                return false;
            }
        }

        return true;
    }
}