//shubhaprasad padhy
//19410121001
//cse j

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
	
	
	//addition of 2 polynomials
	public static void add(Node s1, Node s2) {
		Node po1=s1;
		Node po2=s2;
		while (po1!=null) {
			while (po2!=null) {
				if (po1.exp==po2.exp) {
					po1.coef=po1.coef+po2.coef;
					}
				po2=po2.link;
				
			}
			po2=s2;
			po1=po1.link;
		}
	}
	
	//main method 
	public static void main(String[] args) {
		
		
		System.out.println("Enter the first polynomial \n\n ");
		p1=create(p1);
		System.out.println("\nEnter the second polynomial \n\n ");
		p2=create(p2);
		System.out.println("the first polynomial :- \n\n ");
		display(p1);
		System.out.println("the second polynomial :- \n\n ");
		display(p2);
		add(p1,p2);
		System.out.println("After addition \n\n ");
		display (p1);

	}

}
