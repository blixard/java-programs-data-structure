//run HashTable_menu.java to use the hash table which uses this class to deal with collision
//class of linked that contains functionalities of a linked list
//Shubhaprasad Padhy

public class linked_list {

    

     public node start;
     static node q = new node();

     linked_list(node start_node){
        start=start_node;
    }
    
    

    //add more argument based on what more info you want to add and modify the method based on that
    public static node insert(String name, int key, node start){
        node p = new node();
        
        if(start==null){
            p.name = name;
            p.key = key;
            start=p;
            p.next=null;
        }

        else{
            node st = start;
            while(st.next!=null){
                st=st.next;
            }
            p.name=name;
            p.key=key;
            p.next = null;
            st.next=p;
            
         }

         return start;
     }

    //display method
     public static void display(node start){
         node st=start;
         if(st==null){System.out.println("empty!");}
         while(st!=null){
             System.out.println("name : " + st.name );
             st=st.next;
         }
     }

     public static node remove(node start,int key){
         node st = start;
         node prev = new node();
         if(st.key==key){
            System.out.println("deleted name :" + st.name);
            st=st.next;
            return st;
        }
        else{
            int flag=0;
         while(st.key!=key){
             if(st.next==null){flag =1; break;}
             prev=st;
             st=st.next;
            }
            if(flag==0){
                System.out.println("deleted name :" + st.name);
                prev.next=st.next;
                return start;
            }
            else if(st.key==key){
                System.out.println("deleted name :" + st.name);
                prev.next=st.next;
                return start;
            }
            else{System.out.println("key not found"); return start;}
        }


     }
    
}