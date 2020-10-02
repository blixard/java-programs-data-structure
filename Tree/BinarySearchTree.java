public class BinarySearchTree 
{  

	//Creating a Node class
    public static class Node
    {  
        int data;  
        Node left;  
        Node right;  
        
        public Node(int data) //Parameterized constructor of Node with public access
        {  
            this.data = data;  
            this.left = null; 
            this.right =null;  
        }  
      }  
  
      public Node root;  
      public BinarySearchTree()
      {  
          root = null;  //Setting root as null
      }  
  
      // A method to insert data    
      public void insert(int data) 
      {  
          Node newNode = new Node(data);  
          if(root == null)
          {  
              root = newNode;  
              return;  
          }  
          else 
          {  
              Node current = root, parent = null;  
              while(true)
              {  
                  parent = current;  
                  if(data < current.data) 
                  {  
                      current = current.left;  
                      if(current == null) 
                      {  
                          parent.left = newNode;  
                          return;  
                      }  
                  }  
                  else
                  {  
                      current = current.right;  
                      if(current == null) {  
                          parent.right = newNode;  
                          return;  
                      }  
                  }  
              }  
          }  
      }  
  
      //A method for InOrder Traversal 
      //It means visit left-> Root-> Right of the tree
      public void inorderTraversal(Node node) 
      {  
    
          if(root == null)
          {  
              System.out.println("Tree is empty");  
              return;  
           }  
          else {  
  
              if(node.left!= null)  
                  inorderTraversal(node.left);  
              System.out.print(node.data + " ");  
              if(node.right!= null)  
                  inorderTraversal(node.right);  
          }  
      }  
      
      public static void main(String[] args) {  
  
          BinarySearchTree btree = new BinarySearchTree();  
          //Add nodes to the binary tree  
          btree.insert(2);  
          btree.insert(12);  
          btree.insert(18);  
          btree.insert(25);  
          btree.insert(35);  
          btree.insert(5);  
  
          System.out.println("Binary search tree after inorder traversal:");  
          btree.inorderTraversal(btree.root);       
      }  
}  