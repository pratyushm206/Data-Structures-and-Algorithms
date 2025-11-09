// Question 328 Odd Even Linked List

public class OddEvenLL {

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

    // OddEven LL Creation
    public Node OddEvenLLCreation(Node head){
        if(head == null || head.next == null) return head;
        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;

        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    // Method for adding element in LL
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

    // Method for printing the LL
    public void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    // Main Method
    public static void main(String[] args) {
        OddEvenLL list = new OddEvenLL();
        int[] arr = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        list.addElement(arr);
        list.printLL();

        list.head = list.OddEvenLLCreation(list.head);
        list.printLL();
    }
}