public class PalindromeCheckerApp{
    public static void main(String[] args) {

        String text = "madam";

        boolean isPalindrome = isPalindromeRecursive(text, 0, text.length() - 1);

        if (isPalindrome) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is NOT a Palindrome");
        }
    }

    // Recursive method outside main
    static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}