import java.util.*;
class Node {
	int info;
	Node next;
}
public class Queue_2_dynamic {
	
	static Node front = null;
	static Node rear = null;
	static Scanner sc = new Scanner (System.in);
	
	public static void insert() {
		Node p = new Node ();
		p.info = sc.nextInt();
		p.next=null;
		
		if (front == null && rear == null ) {
			front = p ;
			rear = p;
		}
		else {
			rear.next=p;
			rear = p;
		}
	}
	
	public static void delete() {
		if (front ==null ) {
			System.out.println("Underflow : The Queue is empty");
		}
		else if (front == rear ) {
			int item= front.info;
			front = null;
			rear =null;
			System.out.println(item +" has been deleted ");
		}
		else {
			int item = front.info;
			front=front.next;
			System.out.println(item +" has been deleted ");
		}
	}
	
	public static void display() {
		Node f = front;
		Node r = rear;
		if (f==null) {System.out.println("THE QUEUE IS EMPTY");}
		else {
		while (f!=r.next) {
			System.out.print(f.info + " ");
			f=f.next;
		}
		System.out.println();
		}
	}
	public static void main(String[] args) {
		
		while(true)
		{
		System.out.println("***MENU***");
		System.out.println("0: Exit");
		System.out.println("1: Insert");
		System.out.println("2: Delete");
		System.out.println("3: Display");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 0: System.exit(0);
		case 1: insert();   break;
		case 2: delete();   break;
		case 3: display();   break;
		default:System.out.println("Invalid choice");
		}
		}
	}

}
