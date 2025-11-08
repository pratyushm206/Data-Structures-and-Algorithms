class CreatingLL{
    public class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public static void main(String[] args){
        CreatingLL list = new CreatingLL();

        Node first = list.new Node(5);
        list.head = first;

        Node second = list.new Node(12);
        first.next = second;

        Node third = list.new Node(45);
        second.next = third;

        // Print LL
        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}