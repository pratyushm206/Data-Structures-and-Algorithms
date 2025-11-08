class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class DeletionInLinkedList {
    Node head;
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
    // Deleting head of
    public Node removeHead(Node head){
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
    }
    // Deleting tail of LL
    public Node removeTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class HeadAndTailDeletionInLL{
    public static void main(String[] args) {
        DeletionInLinkedList list= new DeletionInLinkedList();
        int[] arr = {5, 10, 15, 20};
        list.addElement(arr);
        list.printLL();

        list.head = list.removeHead(list.head);
        list.printLL();

        list.head = list.removeTail(list.head);
        list.printLL();
    }
}