//implementation of class HashTable, make sure you import HashTable.java, before running this. the functions wont work outside the package
//main menu
//Hash_table implementation using separate chainig (linked list)
//by- Shubhaprasad padhy

import java.util.*;

public class HashTable_menu {

    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
            System.out.println("enter the size of the hashtable : ");
            int size = sc.nextInt();
            System.out.println();    
            HashTable h = new HashTable(size);
            if(size > h.MAX_SIZE){
                System.out.println("Size limit exceded, max size pssible : "+ h.MAX_SIZE + "Hash Table of "+ h.MAX_SIZE +"has been created");
            }
            else{
                System.out.println("Size of the array : " + size);
            }

            String name; //to store the value
            int key; //to store the key

            //loop till 0 is entered
            while(true){
                //menu(print)
                System.out.println();
                System.out.println("* * * * * * * * * * *MENU* * * * * * * * * * * * * * * * * *");
                System.out.println("*           enter 0 to exit                                *");
                System.out.println("*           enter 1 to add data to the table               *");
                System.out.println("*           enter 2 to display the table                   *");
                System.out.println("*           enter 3 to display the value based on the key  *");
                System.out.println("*           enter 4 to remove a key from the table         *");
                System.out.println("*********************MENU***********************************");

                
                int x = sc.nextInt();
                //menu structure(working)
                sc.nextLine();
                if(x==0){
                    System.out.println("thanks! for running me, hope yaa had a good time!!!!!!");
                    System.out.println("dev:Shubhaprasad Padhy");
                    System.out.println("ver:0.00");
                    System.out.println("ver_date:17.8.20");
                    System.exit(0);
                }
                else if(x==1)
                {
                    System.out.println("ADDING-> ");
                    System.out.println("Enter the name :- ");
                    name = sc.nextLine();
                    System.out.println("Enter the correspondig key :- ");
                    key = sc.nextInt();
                    sc.nextLine();
                    h.add(name, key);
                }
                else if(x==2){
                    System.out.println("DISPLAYING TABLE-> ");
                    h.displayTable();
                }
                else if(x==3){
                    System.out.println("DISPLAYING BY VALUE-> ");
                    System.out.println("Enter the key :-");
                    key = sc.nextInt();
                    sc.nextLine();
                    h.displayValue(key);
                }
                else if(x==4){
                    System.out.println("DELETING-> ");
                    System.out.println("Enter the key :-");
                    key = sc.nextInt();
                    sc.nextLine();
                    h.delete(key);
                }
                else if(x==1001){
                    String password ="";
                    System.out.println("enter the password");
                    password=sc.nextLine();
                    System.out.println("DEVLOPER DETAILS ->");
                    h.devploperDetails(password);
                }
                else{
                    System.out.println("entered characted is not recognized, redirecting to menu");
                }
                
            }
    }
    
}