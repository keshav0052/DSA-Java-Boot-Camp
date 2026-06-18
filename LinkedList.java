// Creation + Traversal
// Define Linkedlist
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
        System.out.print("NULL");
    }
	public static void main(String[] args) {
		head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		traversal();
	}
}

// Insertion at Head and Tail 
// Define Linkedlist
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
        System.out.print("NULL");
    }
    
    public static void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
    }
    
	public static void main(String[] args) {
		insertAtHead(10);
		insertAtHead(20);
		insertAtHead(30);
		insertAtEnd(40);
        traversal();
	}
}

// LinkedList
// Insertion at anyGivenPosition
// Define Linkedlist
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
        System.out.print("NULL");
    }
     public static void insertAtAnyGivenPosition(int data, int position) {
        Node newNode = new Node(data);
        Node temp = head;
        for(int i = 1; i < position - 1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
	public static void main(String[] args) {
		head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		insertAtAnyGivenPosition(35,3);
		traversal();
	}
}
