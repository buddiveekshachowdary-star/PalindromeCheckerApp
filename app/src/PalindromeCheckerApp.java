public class PalindromeCheckerApp{
    public static void main(String[] args) {
        String text = "madam";

// Node class
        class Node {
            char data;
            Node next;

            Node(char data) {
                this.data = data;
                this.next = null;
            }
        }

// Convert string to linked list
        Node head = new Node(text.charAt(0));
        Node current = head;

        for (int i = 1; i < text.length(); i++) {
            current.next = new Node(text.charAt(i));
            current = current.next;
        }

// Find middle using fast and slow pointer
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

// Reverse second half
        Node prev = null;
        while (slow != null) {
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

// Compare both halves
        Node first = head;
        Node second = prev;

        boolean isPalindrome = true;

        while (second != null) {
            if (first.data != second.data) {
                isPalindrome = false;
                break;
            }
            first = first.next;
            second = second.next;
        }

// Print result
        if (isPalindrome) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is NOT a Palindrome");
        }
    }
}