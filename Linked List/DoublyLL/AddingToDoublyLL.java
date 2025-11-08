public class AddingToDoublyLL {
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

    public Node addingToHead(Node head, int data) {
        if (head == null) {
            Node newNode = new Node(data, null, null);
            return newNode;
        }
        Node newNode = new Node(data, head, null);
        return newNode;
    }

    public Node addingToTail(Node head, int data) {
        if (head == null) {
            Node newNode = new Node(data, null, null);
            return newNode;
        }
        Node newNode = new Node(data, null, null);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;


    }

    public Node addingToNode(Node head, int k, int data) {
    if (k <= 0) {
        System.out.println("Invalid index");
        return head;
    }

    Node newNode = new Node(data, null, null);

    // Case 1: Empty list
    if (head == null) {
        if (k == 1) return newNode;
        System.out.println("List is empty, cannot insert at index " + k);
        return null;
    }

    // Case 2: Insert at head position
    if (k == 1) {
        newNode.next = head;
        head.prev = newNode;
        return newNode;
    }

    Node current = head;
    int count = 1;

    // Traverse to (k-1)th node or end
    while (current.next != null && count < k - 1) {
        current = current.next;
        count++;
    }

    // Case 3: Insert at the end
    if (current.next == null && count < k - 1) {
        System.out.println("Index larger than list size. Inserting at the end.");
    }

    // Case 4: Insert after current node
    Node nextNode = current.next;
    current.next = newNode;
    newNode.prev = current;

    if (nextNode != null) {
        newNode.next = nextNode;
        nextNode.prev = newNode;
    }

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
        AddingToDoublyLL list = new AddingToDoublyLL();
        int[] arr = {1, 2, 3, 4, 5};

        list.head = list.creatingDoublyLL(arr);
        list.printLL(list.head);

        list.head = list.addingToHead(list.head, 0);
        list.printLL(list.head);

        list.head = list.addingToTail(list.head, 200);
        list.printLL(list.head);

        list.head = list.addingToNode(list.head, 3, 0);
        list.printLL(list.head);
    }
}
