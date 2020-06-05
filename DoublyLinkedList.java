import java.util.*;

class Node {
	protected int regd_no;
	protected float mark;
	protected Node  next;
	protected Node prev;
}

public class DoublyLinkedList {

	static Scanner sc = new Scanner (System.in);
	static Node start = null;
	static Node end = null;
	
	//creation
	public static void create () {
	
		Node p = new Node();
		System.out.println("Enter the registration number" );
		p.regd_no = sc.nextInt();
		System.out.println("Enter the marks" );
		p.mark= sc.nextFloat();
		p.next= null;
		p.prev=null;
		if (start == null) {
			start = p;
			end =p;
		}
		else {
			end.next=p;
			p.prev=end;
			end=p;
		}
		
		System.out.println("to keep entering please press 1 otherwise press anythinng else");
		int ch=0;
		ch = sc.nextInt();
		while (ch == 1) {
			Node q = new Node();
			System.out.println("Enter the registration number" );
			q.regd_no = sc.nextInt();
			System.out.println("Enter the marks" );
			q.mark= sc.nextFloat();
			q.next= null;
			q.prev=null;
			end.next=q;
			q.prev=end;
			end=q;
			System.out.println("to keep entering please press 1 otherwise press anythinng else");
			ch = sc.nextInt();
		}
		
	}
	
	
	//display
	public static void display() {
		Node s= start;
		Node e = end;
		int ch = 1;
		System.out.println("to print from start to end press 1 ; \n to print from end to start press 2; \n press anything else to go back to menu;");
		ch = sc.nextInt();
		if (ch ==1) {
		while  (s!=null) {
			System.out.println("registration number : " + s.regd_no + "\nmarks : "+ s.mark);
			s=s.next;
		}}
		else if (ch ==2) {
			while  (e!=null) {
				System.out.println("registration number : " + e.regd_no + "\nmarks : "+ e.mark);
				e=e.prev;
			}
		}
		else {System.out.println("redirecting to menu");}
	}
	
	
	//insert at beginning
	public static void InsBeg() {
		Node p = new Node ();
		System.out.println("Enter the registration number" );
		p.regd_no = sc.nextInt();
		System.out.println("Enter the marks" );
		p.mark= sc.nextFloat();
		p.next= null;
		p.prev=null;
		start.prev=p;
		p.next=start;
		start =p;
		}
	
	//insert at ending
		public static void InsEnd() {
			Node p = new Node ();
			System.out.println("Enter the registration number" );
			p.regd_no = sc.nextInt();
			System.out.println("Enter the marks" );
			p.mark= sc.nextFloat();
			p.next= null;
			p.prev=null;
			end.next=p;
			p.prev=end;
			end=p;
			}
		
		//size of 
		public static int sizeof() {
			Node s = start;
			int x =1;
			while (s!=null) {
				x++;
				s=s.next;
			}
			//System.out.println("Size of the list as of now is " + x);
			return x;
		}
		
		//insert at any by position
				public static void InsAny() {
					int pos =0;
					System.out.println("Enter the position you want to insert");
					pos = sc.nextInt();
					
					Node s = start;
					int i=1;
					int flag =1;
					int size = sizeof();
					if (pos==0 || pos ==1) {
						System.out.println("the entered position is at the beginning ");
						flag=0;
						InsBeg();
					}
					else if (pos==size) {
						flag=0;
						InsEnd();
					}
					else if (pos<size ) 
					{
						
					while (i++ < pos-1) {
					   s=s.next;
					}
					}
					else {System.out.println("the entered position doesnt exit");
					flag =0;
					}
						if (flag !=0) {			
						Node p = new Node ();
						System.out.println("Enter the registration number" );
						p.regd_no = sc.nextInt();
						System.out.println("Enter the marks" );
						p.mark= sc.nextFloat();
						p.next= null;
						p.prev=null;
					p.next=s.next;
					p.prev=s;
					s.next.prev=p;
					s.next=p;
						}
					}
				
				//delete at beginning 
				public static void DelBeg() {
					start.next.prev=null;
				    start=start.next;
				}
				
				//delete at ending
				public static void DelEnd() {
					end.prev.next=null;
				    end=end.prev;
				}
				
				//deletion at any position
				public static void DelAny() {
					int pos =0;
					System.out.println("Enter the position you want to delete");
					pos = sc.nextInt();
					Node s=start;
					int x = sizeof();
					if (pos==0) {DelBeg();}
					else if (pos>=x) {
						System.out.println("The entered position doesnt exist for deletion");
					}else if(pos==x-1) {DelEnd();}
					else {
					int i =0;
				while (i++!= pos) {
					s= s.next;
				}
				s.prev.next=s.next;
				s.next.prev=s.prev;
				}}
				
				//search by registration number
				public static void search() {
					int reg;
					System.out.println("Enter the registration number you want to search and update the marks :-");
					Scanner sc = new Scanner (System.in);
					reg = sc.nextInt();
					Node s = start;
					int flag =1;
					while (s.regd_no !=reg && s.next!=null) {
						s=s.next;
					}
					if (s.regd_no==reg) {System.out.println("registration number found. update the mark");
					s.mark = sc.nextFloat();
					}
					else {System.out.println("Error : The registrstion number entered could not be found");}
				}
				
				
		
	
	public static void main(String[] args) {
		while (true) {
			
			
			System.out.println("****MENU*****");    
			System.out.println("0:Exit");    
			System.out.println("1:Creation");   
			System.out.println("2:Display");
			System.out.println("****INSERTION*****");
			System.out.println("3: insert at beg");
			System.out.println("4: insert at end");
			System.out.println("5: insert at any by position");
			System.out.println("****DELETION*****");
			System.out.println("6: Delete at beg");
			System.out.println("7: Delete at end");
			System.out.println("8: Deltet at any by position");
			System.out.println("****OTHER OPERATIONS*****");
			System.out.println("9: to search by registration number");
		;
			System.out.println("Enter the choice");  
			
			int x=0;
			x= sc.nextInt();
			switch (x){
				case 0 : System.exit(0);
				case 1:         create();         break;        
				case 2:         display();        break;             
				case 3:         InsBeg();         break;
				case 4:         InsEnd();         break;
				case 5:         InsAny();         break;
				case 6:         DelBeg();         break;  
				case 7:         DelEnd();         break;
				case 8:         DelAny();         break;
			    case 9:         search();         break;
			    default:        System.out.println("Wrong choice"); 
			}
		}

	}

}
