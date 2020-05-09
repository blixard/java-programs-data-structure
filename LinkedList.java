import java.util.*;


//class node
class Node { 
protected int regd_no;
protected float mark;
protected Node  next;
}



//linked list:
public class LinkedList {
	static Node s = null;
	public static void create() {
		Scanner sc = new Scanner (System.in);
		Node q = new Node ();
		Node p = new Node();
		System.out.println("Enter the registration number : ");
		p.regd_no = sc.nextInt();
		System.out.println("Enter the marks : ");
		p.mark = sc.nextFloat();
		p.next=null;
		if (s == null) {
			s = p;
			q=p;
		}
		
		
		//loop to keep going
		char ch = 'n';
		System.out.println("enter n to stop entering ");
		ch = sc.next().charAt(0);
		while(ch!='n') {
			Node a = new Node();
			System.out.println("Enter the registration number : ");
			a.regd_no = sc.nextInt();
			System.out.println("Enter the marks : ");
			a.mark = sc.nextFloat();
			a.next=null;
			q.next=a;
			q=a;
			System.out.println("enter n to stop entering ");
			ch = sc.next().charAt(0);
		}
	}
	
	
	
	//display method
	public static void display() {
		Node st = s;
		if(st==null) {
			System.out.println("the list is empty");
		}
		while(st!=null) {
			System.out.println("Regd no : " + st.regd_no +"\n" + "Marks : " + st.mark +"\n");
			st=st.next;
		}
	}
	
	
	/****b.deletion******/
	
	//delete at beginning
	 public static void DelBeg() {
		 s = s.next;	
	 }
	 
	 //delete at end
	 public static void DelEnd() {
		    Node stb=null;
			Node st = s;
			while(st.next!=null)
			{
				stb = st;
				st=st.next;
			}
			stb.next=null;
	 }
	 
	 
	 //delete at any position
	 public static void DelAny() {
		 int pos;
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter the position you want to delete the number at");
		 pos = sc.nextInt();
			Node st = s;
			Node stb = new Node ();
			int i=0;
			int flag=0;
			if(pos==0||pos==1) {
				s=s.next;
				System.out.println("The deleted element is "+ st +" \n "+ st.regd_no+" \n "+ st.mark);
			}
			else {
			while(i<pos-1)
			{
				if(st.next==null && (i<pos)) {
					System.out.println("position : " + (i+1) +" is the last position of the list");
					flag=1;
					break;
				}
				i++;
				stb=st;
				st=st.next;
			}
			if (flag==0) {
			System.out.println("The deleted element is "+ st +" \n "+ st.regd_no+" \n "+ st.mark);
			stb.next=st.next;
			}
			else {
				System.out.println("The entered position is not in the list, no element is deleted, you will be redirected to the menu \n thank you ");
			}
			}
      }
	 
	 
	 //delete at any position based on registration number
	 public static void DelAnyR() {
		 int reg;
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter the registraion number you want to delete from the list");
		 reg = sc.nextInt();
			Node st = s;
			Node stb = new Node ();
			int flag = 0;
			while(st !=null)
			{
				
				if (st.regd_no==reg) {
					System.out.println("The deleted element is at "+ st +" \n "+ st.regd_no+" \n "+ st.mark);
					stb.next = st.next;
					flag =1 ;
					break;
					
				} 
				stb = st;
				st=st.next;
				}
			
			if (flag==0) {
				System.out.println("the entered registration number doesnt exist");
			}
			
      }
	 
	 
	 /****a.insertion******/
		
		//insert at beginning
		 public static void InsBeg() {
			 Scanner sc = new Scanner (System.in);
			 Node a = new Node();
				System.out.println("Enter the registration number : ");
				a.regd_no = sc.nextInt();
				System.out.println("Enter the marks : ");
				a.mark = sc.nextFloat();
				a.next=s;
				s=a;
				
		 }
		 
		 //insert at end
		 public static void InsEnd() {
			 Scanner sc = new Scanner (System.in);
			 Node a = new Node();
				System.out.println("Enter the registration number : ");
				a.regd_no = sc.nextInt();
				System.out.println("Enter the marks : ");
				a.mark = sc.nextFloat();
				a.next=null;
				Node st = s;
				while(st.next!=null)
				st=st.next;
				st.next=a;
		 }
		 
		 
		 //insert at any position
		 public static void InsAny() {
			 int pos;
			 Scanner sc = new Scanner (System.in);
			 System.out.println("Enter the position you want to enter the number");
			 pos = sc.nextInt();
			 Node a = new Node();
				System.out.println("Enter the registration number : ");
				a.regd_no = sc.nextInt();
				System.out.println("Enter the marks : ");
				a.mark = sc.nextFloat();
				Node st = s;
				Node stb = new Node ();
				int i=0;
				int flag=0;
				while(i<pos-1)
				{
					if(st.next==null && (i<pos)) {
						System.out.println("position : " + (i+1) +" is the last position of the list");
						flag=1;
						break;
					}
					
					i++;
					
					stb=st;
					st=st.next;
				}
				if(st.next==null&&(pos==i+2)) {
					st.next=a;
					a.next=null;
				}
				else if (flag==0) {
				a.next=st;
				stb.next=a;
				}
				else {
					System.out.println("The entered position is not in the list, no element can be inserted, you will be redirected to the menu \n thank you ");
				}
	      }
		 
		 
		 //insert at any position based on registration number
		 public static void InsAnyR() {
			 int reg;
			 Scanner sc = new Scanner (System.in);
			 System.out.println("Enter the registraion number you want to enter after");
			 reg = sc.nextInt();
			 Node a = new Node();
				System.out.println("Enter the registration number : ");
				a.regd_no = sc.nextInt();
				System.out.println("Enter the marks : ");
				a.mark = sc.nextFloat();
				Node st = s;
				Node stb = new Node ();
				Node sta = s;
				Node stbb = new Node ();
				int flag = 0;
				while(st !=null)
				{
					if (st.regd_no==reg) {
						flag = 1;
						sta=st;
						break;
					}
					st=st.next;
					}
				if (flag==1) {
				a.next=sta.next;
				sta.next=a;
				}
				else {
					System.out.println("the entered registration number doesnt exist");
				}
	      }
		 
		 
		 /****c.search******/
		 //search by registration number
		 public static void search() {
			 int reg;
			 Scanner sc = new Scanner (System.in);
			 System.out.println("Enter the registraion number you want to enter after");
			 reg = sc.nextInt();
				Node st = s;
				Node stb = new Node ();
				Node stbb = new Node ();
				int flag = 0;
				int pos=0;
				int fpos=0;
				while(st !=null)
				{
					if (st.regd_no==reg) {
						flag = 1;
						stbb=st;
						fpos=pos+1;
						break;
					}
					st=st.next;
					pos++;
					}
				if (flag==1) {
					System.out.println("the entered registration number " +reg + " is at "+ fpos +" positon");
					System.out.println("if you want to update the mark , then press y otherwise press anything ");
					char ch='n';
					ch=sc.next().charAt(0);
					if(ch=='y') {
						System.out.println("you entered the character 'y', please enter the new mark to update :-");
						stbb.mark=sc.nextFloat();
					}
					else {
						System.out.println("you entered the character " + ch + " you will be forwareded to menu, to update the marks, please repeat your previous procedure and click y instead of " + ch +"\n thank you ");
						
					}
					
				}
				else {
					System.out.println("the entered registration number doesnt exist");
				}
	      }
		 
		 
		 
		 
		 /****d.sorting******/
		 //sort by marks obtained----bubble sort
		 public static void Bsort() {
			 Node i=new Node ();
			 Node j= new Node();
			 for (i=s;i.next!=null;i=i.next)
				 for(j=s;j.next!=null;j=j.next) {
					 if(j.mark<j.next.mark) {
						 float temp=0;
						 temp = j.mark;
						 j.mark = j.next.mark;
						 j.next.mark = temp;
					 }
				 }
			 System.out.println("the list has been sorted in descending order of marks .\n to see the newly sorted list please select display by pressing 2 in the menu. ");
	      }
		 
		 
	 
		 /****e.count******/
		 //counting the number of nodes present in the list
		 public static void count() {
			 Node st = s;
			 int count = 0;
			 while(st != null) {
				 count ++;
				 st=st.next;
			 }
			 System.out.println("no of nodes : " + count);
	      }
		 
		 
		 /****f.reverse******/
		 //counting the number of nodes present in the list
		 public static void reverse() {
			 Node stb = null;
			 Node st = s;
			 Node sta =null;
			 while(st!= null) {
				 sta=st.next;
				 st.next=stb;
				 stb=st;
				 st=sta;
			 }
			 
			 s=stb;
			 
	      }
			

	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner (System.in);
		
		while(true) {       
			System.out.println("****MENU*****");    
			System.out.println("0:Exit");    
			System.out.println("1:Creation");   
			System.out.println("2:Display");
			System.out.println("****INSERTION*****");
			System.out.println("3:insert at beg");
			System.out.println("4: insert at end");
			System.out.println("5: insert at any by position");
			System.out.println("6: insert at any by registration number");
			System.out.println("****DELETION*****");
			System.out.println("7: Delete at beg");
			System.out.println("8: Delete at end");
			System.out.println("9: Deltet at any by position");
			System.out.println("10: Delete at any by registration number");
			System.out.println("11: to search by registration number");
			System.out.println("12: to sort by marks");
			System.out.println("13: to count the number of nodes");
			System.out.println("14: to reverse the list");
			System.out.println("Enter the choice");  
			int choice=sc.nextInt();  
			 switch(choice)    {       
			case 0:         System.exit(0);        
			case 1:         create();         break;        
			case 2:         display();        break;             
			case 3:         InsBeg();         break;
			case 4:         InsEnd();         break;
			case 5:         InsAny();         break;
			case 6:         InsAnyR();        break;
			case 7:         DelBeg();         break;
			case 8:         DelEnd();         break;
			case 9:         DelAny();         break;
			case 10:        DelAnyR();        break;
			case 11:        search();         break;
			case 12:        Bsort();          break;
			case 13:        count();          break;
			case 14:        reverse();          break;
			default:        System.out.println("Wrong choice"); 
			}
			}
		

	}

}
