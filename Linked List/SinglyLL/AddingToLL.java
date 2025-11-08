public class AddingToLL {
    public class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    // Addig to head
    public Node insertToHead(Node head, int data){
        Node temp = new Node(data);
        temp.next = head;
        return temp;
    }

    // Adding to Tail
    public Node insertToTail(Node head, int data){
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    // Adding element at Kth position in LL
    public Node insertAtPosition(Node head, int k, int data){
        if (k <= 0) {
            System.out.println("Invalid position!");
            return head;
        }

        Node newNode = new Node(data);
        
        if (k == 1) { // insert at head
            newNode.next = head;
            return newNode;
        }
        Node temp = head;
        int count = 1;

        while (temp != null && count < (k-1)) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position out of Bound");
            return head;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    // Inserting the element before the value x
    public Node insertBeforeValue(Node head, int x, int data){
        if (head == null) {
            System.out.println("List is empty!");
            return null;
        }
        Node newNode = new Node(data);
        if (head.data == x) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node temp = head;

        while (temp.next != null) {
            if (temp.next.data == x) {
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        System.out.println("Value " + x + " not found in list.");
        return head;
    }

    // Printiong LL
    public void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"-> ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println();
    }

    
    // Adding Elements of Array to LL
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

    // Main Method
    public static void main(String[] args){
        AddingToLL list = new AddingToLL();
        int[] arr = {5, 10, 15, 20};

        list.addElement(arr);
        System.out.println("Printing the array");
        list.printLL();

        list.head = list.insertToHead(list.head, 0);
        System.out.println("Inserting to head");
        list.printLL();

        list.head = list.insertToTail(list.head, 25);
        System.out.println("Inserting to tail");
        list.printLL();

        System.out.println("Inserting at Kth position");
        list.head = list.insertAtPosition(list.head, 3, 12);
        list.printLL();

        System.out.println("Inserting before value x");
        list.head = list.insertBeforeValue(list.head, 0, 2);
        list.printLL();
    }
}