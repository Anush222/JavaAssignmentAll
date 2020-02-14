package Ls;

import java.util.Scanner;

public class LSearch { 
     
     static int linearSearch(int arr[], int index, int len, int num) 
     { 
          if (len < index) 
             return -1; 
          if (arr[index] == num) 
             return index; 
          if (arr[len] == num) 
             return len; 
          return linearSearch(arr, index+1, len-1, num); 
     } 
       
   
     public static void main(String[] args)  
     { 
    	 int arr[] = {31, 11, 33, 25, 7};
    	 int num,len;
    	 System.out.println("Please enter number you want to search");
    	 Scanner sc=new Scanner(System.in);
         num=sc.nextInt();
         sc.close();
         len=arr.len-1;
          
        int index = linearSearch(arr, 0, len, num); 
        if (index != -1) 
           System.out.println(num + " is present in index" +index); 
        else
            System.out.println(num + " is absent"); 
        } 

}
