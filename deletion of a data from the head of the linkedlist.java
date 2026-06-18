class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Main
{
    static Node head = null;
    
    public static void deletefromHead() {
        if(head == null) {
            return;
        }
        head = head.next;
    }
    
    public static void deleteFromTail() {
        if(head == null) {
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
    public static void deleteFromAnyGivenPosition(int position) {
        if(head == null){
            return;
        }
        Node temp = head;
        for(int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    
    public static void traversal() {
        
        if(head == null){
            System.out.println("LinkedList is null");
            return;
        }
        
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
	public static void main(String[] args) {
		head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		traversal();
		deleteFromAnyGivenPosition(3);
		//deleteFromTail();
		//deletefromHead();
		traversal();

	}
}
