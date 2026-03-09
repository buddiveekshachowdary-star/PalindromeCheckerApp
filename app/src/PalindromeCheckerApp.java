public class PalindromeCheckerApp{
    public static void main(String[] args) {
        String text = "madam";

// Create Stack and Queue
        java.util.Stack<Character> stack = new java.util.Stack<>();
        java.util.Queue<Character> queue = new java.util.LinkedList<>();

// Push into stack and enqueue into queue
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }

        boolean isPalindrome = true;

// Compare dequeue (FIFO) with pop (LIFO)
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() != queue.remove()) {
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