//a simple implementation of separate chaining hash table 
//run HashTable_mnu.java to use the hash table
//class of hash table that contains functionalities of a hash table
//change MAX_SIZE to increase the pssible size of hash table
//Shubhaprasad Padhy

import java.io.IOException;
import java.io.*;
import java.util.*;

//data structure -  hash table using chained linking
public class HashTable {

    //maximum possible size of the hash table
    //if you want to have a hash table of bigger size, then you need to change the max_size 
    static int MAX_SIZE = 100000;
    static int size = MAX_SIZE;

    //CONSTRUCTOR- takes size of the array (based on size, hash method determines the index)
    HashTable(int size_f){
        size= size_f;
        
    }
    //the actual list - hashtable - array of linked list, depending on the key, index is found by using hash function, then on the index of this list l, data is stored
    static linked_list [] l = new linked_list [size];
    static String [] used = new String [size];//stores if the index of l has an element or empty in its correspondin index 
    
    //returns the index of the array
    public static int hash(int key){
        return key%size;
    }
     
    //adding elements to hash table
    public void add(String name,int key){

        int index = hash(key);
        if(used[index]!="yes"){
        node start = null;
        l[index]= new linked_list(start);
        used[index]="yes";
        l[index].start = l[index].insert(name, key, l[index].start);
    }
    else{
       l[index].start= l[index].insert(name, key, l[index].start);
    }

        
    }
    //get method to get the value(returns) based on the key
    public String get(int key){
        node start = new node();
        int index = hash(key);
        start = l[index].start;
        //traverse to the node contatining the key
        while(start.key != key){
            start = start.next;
        }
        String name = start.name;
        return name;
    }


    //display_table method- displays the hash table
    public void displayTable(){
        node start = new node();
        
        //traverse to the node contatining the key
        for (int i=0; i<size; i++){
            System.out.print(i + " :-");
            if(used[i]!="yes"){
                System.out.print("null");
            }
            else{
            start = l[i].start;
            while(start!= null){
                System.out.print("name: "+ start.name +" key: "+ start.key +" -> " );
                start = start.next;
            }

            }

            System.out.println();

        }
    }

    public void displayValue(int key){
        int index = hash(key);
        if(used[index]!="yes"){System.out.println("KEY not found");}
        else{
        node start = l[index].start;
        int flag =0;
        //if(start==null){System.out.println("NULL");}
        while(start.key != key){
            if(start.next == null){flag=1; break;}
            start = start.next;
            
        }
        if(flag==0){
        System.out.println("name: "+ start.name);}
        else if(start.key==key){System.out.println("name: "+ start.name);}
        else{System.out.println("key not found ");}
        }

    }

    public void delete(int key){
        int index = hash(key);
        if(used[index]!="yes"){System.out.println("KEY dont exist");}
        else{
            l[index].start = l[index].remove(l[index].start, key);
        }
    }

    public static void devploperDetails(String password){
        String passwordIs="qwertyui06";
        if(password.equals(passwordIs)){
            System.out.println("Size of the hash table: "+ size);
            System.out.println("maximum size hash table that can be made: "+ MAX_SIZE);
            System.out.println("made by: Shubhaprasad Padhy");
            System.out.println("ver:0.00");
            System.out.println("ver_date: 17.8.2020");
            System.out.println("made on: 17:8:2020");
                    
        }
        else{
            System.out.println("PASSWORD IS WRONG");
        }
    }

    public static void main(String [] args)throws IOException{

        try{
        }catch(Exception e){
            System.out.println("IOException");
            return;
        }

    }
    
}