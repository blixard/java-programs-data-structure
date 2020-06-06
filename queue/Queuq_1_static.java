import java.util.*;
public class Queuq_1_static {
	static Scanner sc = new Scanner (System.in);
	static int MAX =0;
	static int[] Queue = new int[0];
	static int front = -1;
	static int rear = -1;
	//insert
	public static void insert() {
		if (front == -1 && rear == -1) {
			front =0;
			rear =0;
			Queue[rear] = sc.nextInt();
		}
		else if (rear == MAX-1 ) {
			System.out.println("overflow : Queue is full ");
		}
		else {
			rear ++;
			Queue[rear] = sc.nextInt();
		}
		
	}
	
	//display
	
	public static void display() {
		if (front==-1) {System.out.println("The Queue is empty");}
		else {
		for (int i = front ; i<=rear ; i++) {
			System.out.print(Queue[i] + "  ");
		}
		System.out.println();
	}
		}
	
	//delete
	public static void delete() {
		if (front == -1 ) {
			System.out.println("Underflow : the queue is empty");
		}
		else if (front == rear) {
			int item = Queue[front] ;
			front =-1;
			rear=-1;
			System.out.println(item + " has been deleted");
		}
		else {
			int item = Queue[front] ;
			front++;
			System.out.println(item + " has been deleted");
		}
	}

	public static void main(String[] args) {
		int size;
		System.out.println("Enter the size of the queue");
		size  = sc.nextInt();
		MAX = size;
		int []q = new int [size];
		Queue = q;
		
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
