public class ArrayToDoublyLL {
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
        ArrayToDoublyLL list = new ArrayToDoublyLL();
        int[] arr = {2, 4, 5, 8};
        list.head = list.creatingDoublyLL(arr);
        list.printLL(list.head);
    }
}
