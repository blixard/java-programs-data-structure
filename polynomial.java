//Shubhaprasad Padhy
//19410121001
//cse-j

/**minor project on linked list**/

import java.util.*;

//class to store polynomial
class Node {
	float coef;
	int exp;
	Node link;
}

public class polynomial {

	static Node p1= null;
	static Node p2= null;
	static Node p3= null;
	
	//creation of linkedlist - polynomial
	public static Node create(Node start) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the polynomial in order: 1st coefficient, then its exponents by its degree: ");
		Node a= new Node ();
		Node q= new Node();
		System.out.println("coefficient :");
		a.coef= sc.nextFloat();
		System.out.println("exponent :");
		a.exp=sc.nextInt();
		a.link= null;
		if (start==null)
		{start=a;
		q=a;
		}
		char ch = 'n';
		System.out.println("enter n to stop entering ");
		ch = sc.next().charAt(0);
		while(ch!='n') {
			Node b = new Node();
			System.out.println("coefficient :");
			b.coef= sc.nextFloat();
			System.out.println("exponent :");
			b.exp=sc.nextInt();
			b.link= null;
			q.link=b;
			q=b;
			System.out.println("enter n to stop entering ");
			ch = sc.next().charAt(0);
		}
		return start;
	
	}
	
	
	//displaying the linked list - polynomial
	public static void display(Node start) {
		Node st = start;
		if(st==null) {
			System.out.println("the list is empty");
		}
		while(st!=null) {
			System.out.println("coefficient : " + st.coef +"\n" + "exponent : " + st.exp +"\n");
			st=st.link;
		}
	}
	
	
	//display in polynomial format
	public static void pdisplay(Node s) {
		while (s!=null) {
			System.out.print(s.coef + " x^" + s.exp + " (+) " );
			s=s.link;
		}
		System.out.println();
	}
	
	
	//addition of 2 polynomials
	public static Node add(Node s1, Node s2) {
		Node po1=s1;
		Node po2=s2;
		Node q = new Node ();
		
		q =p3;
		while (po1!=null && po2!= null) {
			 
				if (po1.exp==po2.exp) {
					Node a= new Node ();
					a.coef=po1.coef+po2.coef;
					a.exp=po1.exp;
					a.link=null;
					if (p3==null) {
						p3 =a;
						q=a;
					}
					else {
						q.link =a;
						q=a;
					}
					po1=po1.link;
					po2=po2.link;
					
					}
				else if (po1.exp>po2.exp) {
					Node a= new Node ();
					a.coef=po1.coef;
					a.exp=po1.exp;
					a.link=null;
					if (p3==null) {
						p3 =a;
						q=a;
					}
					else {
						q.link =a;
						q=a;
					}
					po1=po1.link;
				}
				else {
					Node a= new Node ();
					a.coef=po2.coef;
					a.exp=po2.exp;
					a.link=null;
					if (p3==null) {
						p3 =a;
						q=a;
					}
					else {
						q.link =a;
						q=a;
					}
					po2=po2.link;
				
				
			}
			
		}
		
		while(po1!=null) {
			Node a= new Node ();
			a.coef=po1.coef;
			a.exp=po1.exp;
			a.link=null;
			if (p3==null) {
				p3 =a;
				q=a;
			}
			else {
				q.link =a;
				q=a;
			}
			po1=po1.link;
		}
		
		
		while(po2!=null) {
			Node a= new Node ();
			a.coef=po2.coef;
			a.exp=po2.exp;
			a.link=null;
			if (p3==null) {
				p3 =a;
				q=a;
			}
			else {
				q.link =a;
				q=a;
			}
			po2=po2.link;
		}
			
			
		System.out.println("\nthe two polynomials has been added, to display it please press 4, redirecting to menu , thank you \n\n");
	
		return p3;
	}
	
	
	
	//sorting 
	public static void Bsort(Node s) {
		 Node i=new Node ();
		 Node j= new Node();
		 for (i=s;i.link!=null;i=i.link)
			 for(j=s;j.link!=null;j=j.link) {
				 if(j.exp<j.link.exp) {
					 int temp=0;
					 temp = j.exp;
					 j.exp = j.link.exp;
					 j.link.exp = temp;
				 }
			 }
		 System.out.println("the list has been sorted in descending order of marks .\n to see the newly sorted list please select display by pressing 2 in the menu. ");
     }
	
	
	
		
	
	
	//main method 
	public static void main(String[] args) {
		
		int x=0;
		System.out.println("Enter the first polynomial \n\n ");
		p1=create(p1);
		Bsort(p1);
		System.out.println("Thanks for creating the first polynomial \n\n");
		System.out.println("\nEnter the second polynomial \n\n ");
		p2=create(p2);
		Bsort(p2);
		System.out.println("Thanks for creating the second polynomial, you will now be directed to the menu \n\n");
		Scanner sc = new Scanner (System.in);
		while (true) {
			System.out.println("****MENU*****");    
			System.out.println("0:Exit");    
			System.out.println("1:addition");   
			System.out.println("2:Display the first polynomial");
			System.out.println("3:Display the second polynomial");
			System.out.println("4:Display the added polynomial");
			System.out.println("5:change the first polynomial");
			System.out.println("6:change the second polynomial");
			System.out.println("7:Display the first polynomial in polynomial format");
			System.out.println("8:Display the second polynomial in polynomial format");
			System.out.println("9:Display the added polynomial in polynomial format");
			int ch = 0;
			ch = sc.nextInt();
			switch (ch) {
			case 0 : System.exit(0); break;
			case 1:        p3=null; p3= add(p1,p2);            break;        
			case 2:        display(p1);                        break;  
			case 3:        display(p2);                        break;
			case 4:        display(p3);                        break;
			case 5:        p1=null; p1=create(p1); Bsort(p1);  break;
			case 6:        p2=null; p2=create(p2); Bsort(p1);  break;
			case 7:        pdisplay(p1);                       break;  
			case 8:        pdisplay(p2);                       break;
			case 9:        pdisplay(p3);                       break;
			} 
		}

	}

}
