package RD;

public class RemoveDuplicates{
	 Node head; 
	   
	    class Node 
	    { 
	        int num; 
	        Node next; 
	        Node(int i) {num = i; next = null; } 
	    } 
	  
	    void RemoveDuplicates() 
	    { 
	        
	        Node con = head; 
	        while (con != null) { 
	             Node temporary = con; 
	            while(temporary!=null && temporary.num==con.num) { 
	                temporary = temporary.next; 
	            } 
	            con.next = temporary; 
	            con = con.next; 
	        } 
	    } 
	                      
	   
	    public void push(int new_num) 
	    { 
	        
	        Node nNode = new Node(new_num); 
	   
	     
	        nNode.next = head; 
	   
	      
	        head = nNode; 
	    } 
	  
	   
	     void printList() 
	     { 
	         Node temporary = head; 
	         while (temporary != null) 
	         { 
	            System.out.print(temporary.num+" "); 
	            temporary = temporary.next; 
	         }   
	         System.out.println(); 
	     } 
	  
	    
	    public static void main(String args[]) 
	    { 
	        RemoveDuplicates list = new RemoveDuplicates(); 
	        list.push(80); 
	        list.push(50); 
	        list.push(80); 
	        list.push(20); 
	        list.push(50); 
	        list.push(80);
	          
	        list.removeDuplicates(); 
	          
	        System.out.println("The list after removal of duplicates"); 
	        list.printList(); 
	    } 
}
