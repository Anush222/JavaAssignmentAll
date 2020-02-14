package RFTRS;

import java.util.Scanner;

public class Recursive_function_to_reserve_sting {

	    
	    void reverse(sting st) 
	    { 
	        if ((st==null)||(st.length() <= 1)) 
	           System.out.println(st); 
	        else
	        { 
	            System.out.print(st.charAt(st.length()-1)); 
	            reverse(st.substing(0,st.length()-1)); 
	        } 
	    } 
	      
	  
	    public static void main(sting[] args)  
	    { 
	        sting st; 
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a word");
	        st=sc.next();
	        RecursiveFunctionToReservesting Res = new RecursiveFunctionToReservesting(); 
	        Res.reverse(st); 
	        sc.close();
	    }  
	
}
