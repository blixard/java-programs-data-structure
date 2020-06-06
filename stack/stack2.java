import java.util.*;

class Node {
	int info;
	Node next;
}

public class stack2 {
	
	static Scanner sc = new Scanner (System.in); 

	static Node start = null;
//push	
	public static Node push(Node top) {
		
		Node p = new Node();
		p.info=sc.nextInt();
		p.next=null;
		if (top == null) {
			start = p;
			top=p;
			return top;
		}
		else {
			top.next=p;
			top=p;
			return top;
		}
	}
//display	
	public static void display (Node top) {
		Node s = start ;
		if (top==null) {System.out.println("the stack is empty ");}
		else {	
			while (s != top.next) {
			System.out.println(s.info);
			s=s.next;
		}}
	}
	
	//pop
	public static Node pop(Node top) {
		if (top == null) {
			System.out.println("Underflow : the stack is empty ");
			return top;
		}
		else {
			int item = top.info;
			System.out.println(item +" has been deleted");
			Node s = start ;
			Node st = null;
			while (s != top) {
				st =s;
				s=s.next;
			}
			top =st;
			return top;
		}
	}
	
	public static void main(String[] args) {
		
		Node top = null;

		while(true)
		{
		System.out.println("***MENU***");
		System.out.println("0: Exit");
		System.out.println("1: Push");
		System.out.println("2: Pop");
		System.out.println("3: Display");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 0: System.exit(0);
		case 1: top = push(top);    break;
		case 2: top = pop(top);     break;
		case 3: display(top);	    break;
		default: System.out.println("Invalid choice");
		}
		}
	}

}
