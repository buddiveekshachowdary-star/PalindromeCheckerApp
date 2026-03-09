public class PalindromeCheckerApp{
    public static void main(String[] args) {
        String text = "A man a plan a canal Panama";

        // Normalize the string for fair comparison (remove spaces, lowercase)
        String normalized = text.replaceAll("\\s+", "").toLowerCase();

        // Run different palindrome algorithms and measure execution time
        long start, end;

        // 1️⃣ Simple Reverse
        start = System.nanoTime();
        boolean simpleResult = simpleReverse(normalized);
        end = System.nanoTime();
        long simpleTime = end - start;

        // 2️⃣ Character Array Method
        start = System.nanoTime();
        boolean arrayResult = charArrayMethod(normalized);
        end = System.nanoTime();
        long arrayTime = end - start;

        // 3️⃣ Two-pointer Deque Simulation
        start = System.nanoTime();
        boolean dequeResult = dequeMethod(normalized);
        end = System.nanoTime();
        long dequeTime = end - start;

        // 4️⃣ Stack Simulation
        start = System.nanoTime();
        boolean stackResult = stackMethod(normalized);
        end = System.nanoTime();
        long stackTime = end - start;

        // Display results
        System.out.println("Palindrome check results for: \"" + text + "\"\n");

        System.out.println("Simple Reverse: " + simpleResult + " | Time: " + simpleTime + " ns");
        System.out.println("Char Array Method: " + arrayResult + " | Time: " + arrayTime + " ns");
        System.out.println("Deque Method: " + dequeResult + " | Time: " + dequeTime + " ns");
        System.out.println("Stack Method: " + stackResult + " | Time: " + stackTime + " ns");
    }

    // ================= Algorithm Implementations =================

    // Simple Reverse
    static boolean simpleReverse(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return text.equals(reversed);
    }

    // Char Array Method
    static boolean charArrayMethod(String text) {
        char[] chars = text.toCharArray();
        int start = 0, end = chars.length - 1;
        while (start < end) {
            if (chars[start++] != chars[end--]) return false;
        }
        return true;
    }

    // Deque Simulation
    static boolean dequeMethod(String text) {
        char[] deque = new char[text.length()];
        for (int i = 0; i < text.length(); i++) deque[i] = text.charAt(i);

        int front = 0, rear = deque.length - 1;
        while (front < rear) {
            if (deque[front++] != deque[rear--]) return false;
        }
        return true;
    }

    // Stack Simulation
    static boolean stackMethod(String text) {
        char[] stack = new char[text.length()];
        int top = -1;
        for (int i = 0; i < text.length(); i++) stack[++top] = text.charAt(i);

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != stack[top--]) return false;
        }
        return true;
    }
}