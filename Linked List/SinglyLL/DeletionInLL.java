class DeletionInLL {
    // Node Class
    public class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    // Deleting Node from LL
    Node deletingNode(Node head, int k){
        if (head == null) {
            return head;
        }
        if (k == 1) {
            head = head.next;
            return head;
        }
        int count = 0;
        Node temp = head;
        Node previous = null;

        while (temp!= null) {
            count++;
            if (count == k) {
                previous.next = previous.next.next;
                break;
            }
            previous = temp;
            temp = temp.next;
        }
        return head;
    }

    // Deleting Element from LL
    public Node deleteEl(Node head, int element){
        if (head == null) return head;
        Node temp = head;
        Node prev = null;
        while (temp!= null) {
            if (temp.data == element) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public void addElement(int[] arr){
        Node current = null;
        for(int value: arr){
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                current = head;
            }
            else{
                current.next = newNode;
                current = current.next;
            }
        }
    }

    public void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        DeletionInLL list = new DeletionInLL();
        int[] arr = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        list.addElement(arr);
        list.printLL();

        list.head = list.deletingNode(list.head, 3);
        list.printLL();

        list.head = list.deleteEl(list.head, 40);
        list.printLL();
    }
}
