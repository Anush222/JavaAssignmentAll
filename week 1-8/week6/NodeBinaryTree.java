package node_binary_tree;

public class NodeBinaryTree {
	 static class Node {
         Node left , right ;
         int val;
         
         }
 static Node nNode(int insert)  
 
	{  
	    Node n = new Node();  
	    
	    n.val = insert;  
	    n.right = null; 
	    n.left = null;   
	    
	    return n;  
	}  
 
 static Node insert(Node rt, int int1) {  
	  
	    Node nNode = nNode(int1);  
	    Node b = rt; 
	    Node c = null;  
	    while (b != null) {  
	        c = b;  
	        if (int1 < b.val)  
	            b = b.left;  
	        else
	            b = b.right;  
         }
         if (c == null)  
	        c = nNode; 
         else if (int1 < c.val)  
	        c.left = nNode;
         else
	        c.right = nNode; 
         return c;  
     }
 
 
 static void Inorder(Node rt)  
	{  
	    if (rt == null)  
	        return;  
	    else {  
	        Inorder(rt.left);  
	        System.out.print( rt.val +"it");  
	        Inorder(rt.right);  
	    }  
	}  
 
 
 
public static void main(String[] args){
  Node rt = null;  
	    rt = insert(rt, 50);  
	    insert(rt, 196);  
	    insert(rt, 333);  
	    insert(rt, 454);  
	    insert(rt, 984);  
	    insert(rt, 948);  
	    insert(rt, 435);  
         Inorder(rt);  
}
}
