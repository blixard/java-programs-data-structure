import java.util.*;
public class Stack1 {
	
	static int top =-1;
	static int MAX=0;
	static Scanner sc = new Scanner (System.in);
	static int[] stack = new int[0];
//push
	public static void push() {
		
		if (top==MAX-1) {
			System.out.println("Overflow : The stack is full");
		}
		else {
			top++;
			stack [top] = sc.nextInt();
		}
	}
	
//display	
	public static void display() {
		int i =0;
		if (top==-1) {System.out.println("The stack is empty");}
		else{
			while (i<=top) {
			System.out.println(stack[i]);
			i++;
		}
			}
	}
	
//pop
	public static void pop() {
		int item;
		if (top==-1) {System.out.println("underflow : The stack is empty");}
		else {
			item = stack [top];
			top--;
			System.out.println(item + " has been deleted");
		}
		
	}
	
	
//is empty
	public static boolean isEmpty() {
		if (top==-1) {return true;}
		else {return false;}
	}
	
//is full
	public static boolean isFull () {
		if (top == MAX-1) {return true ;}
		else {return false;}
	}
	
	public static void main(String[] args) {
		int n;
		System.out.println("ENter the size of the stack");
        n=sc.nextInt();
        MAX=n;
		int s [] = new int[MAX];
		stack=s;
		while(true)
		{
		System.out.println("***MENU***");
		System.out.println("0: Exit");
		System.out.println("1: Push");
		System.out.println("2: Pop");
		System.out.println("3: Display");
		System.out.println("4: is empty ");
		System.out.println("5: is full ");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 0: System.exit(0);
		case 1:  push();    break;
		case 2:  pop();     break;
		case 3: display();	break;
		case 4: System.out.println(isEmpty());	break;
		case 5: System.out.println(isFull());	break;
		default: System.out.println("Invalid choice");
		}
		}
	}

}
