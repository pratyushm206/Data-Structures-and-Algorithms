import java.util.*;

class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    // Node head;

public class DetectAndRemoveLoopInLL {
    public static boolean removeLoop(Node head) {
        if (head == null || head.next == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            // Loop detected
            if (fast == slow) {
                slow = head;

                // Moving both one step at a time to find loop start

                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
                // Break the loop
                fast.next = null;
                return true;
            }
        }
        return false;
    }

    // Printing the linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to create a loop for testing
    static void createLoop(Node head, int position) {
        if (position == 0) return;

        Node loopNode = head;
        for (int i = 1; i < position; i++) {
            if (loopNode.next != null)
                loopNode = loopNode.next;
            else
                return;
        }

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = loopNode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example input
        // 5
        // 1 2 3 4 5
        // 2   <-- loop starting position (0 for no loop)

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Node head = null, tail = null;

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.print("Enter position to create loop (0 for no loop): ");
        int pos = sc.nextInt();
        createLoop(head, pos);

        // Remove loop if exists
        boolean hadLoop = removeLoop(head);

        if (hadLoop)
            System.out.println("Loop detected and removed successfully.");
        else
            System.out.println("No loop found.");

        // Print list after loop removal
        System.out.print("Linked List after loop removal: ");
        printList(head);

        sc.close();
    }
}