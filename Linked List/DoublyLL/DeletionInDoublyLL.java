public class DeletionInDoublyLL {
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    Node head;

    public Node deletingHead(Node head){
        if (head == null) {
            return head;
        }
        Node temp = head.next;
        temp.prev = null;
        head.next = null;
        return temp;
    }

    public Node deletingTail(Node head){
        if (head == null) {
            return null;
        }
        // Case 1: Only one node
        if (head.next == null) {
            return null; // List becomes empty after deletion
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        Node temp = current.prev;
        temp.next = null;
        current.prev = null;
        
        return head;
    }

    // Deleting Kth node
    public Node deletingKthNode(Node head, int k){
        if (head == null || k<=0) {
            System.out.println("Empty List or Invalid index");
            return null;
        }

        Node current = head;
        int count = 1;

        // Traverse to the k-th node
        while(current.next != null && count < k) {
            count++;
            current = current.next;
        }

        // If k is larger than list size
        if (current.next == null && count < k) {
            System.out.println("Size of list is smaller than the index");
            return null;
        }

        // Deleting head node
        if (current == head) {
            head = head.next;
            if (head != null) head.prev = null;
            return head;
        }

        // Deleting last node 
        if (current.next == null && count == k) {
            Node temp = current.prev;
            current.prev = null;
            temp.next = null;
            return head;
        }

        // Deleting middle node
        Node prevNode = current.prev;
        Node nextNode = current.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        current.prev = null;
        current.next = null;

        return head;
    }

    public Node creatingDoublyLL(int[] arr){
        if (arr.length <= 0) {
            System.out.println("Array Is Empty");
            return null;
        }
        Node head = new Node(arr[0], null, null);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;

    }

    public void printLL(Node head){
        Node current = head;
        while (current != null) {
            System.out.print(current.data+" <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeletionInDoublyLL list = new DeletionInDoublyLL();
        int[] arr = {1, 2, 3, 4, 5, 6};

        list.head = list.creatingDoublyLL(arr);
        list.printLL(list.head);

        list.head = list.deletingHead(list.head);
        list.printLL(list.head);

        list.head = list.deletingTail(list.head);
        list.printLL(list.head);

        list.head = list.deletingKthNode(list.head, 1);
        list.printLL(list.head);
    }
}

