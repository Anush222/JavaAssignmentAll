package BS;

public class binSearch {
    int binSearch(int arr[], int index, int len, int num) 
    { 
        if (len >= index) { 
            int middledle = index + (len - index) / 2; 
  
            if (arr[middle] == num) 
                return middle; 
  
       
            if (arr[middle] > num) 
                return binSearch(arr, index, middle - 1, num); 
  
          
            return binSearch(arr, middle + 1, len, num); 
        } 
  
    
        return -1; 
    } 
  
   
    public static void main(String args[]) 
    { 
    	int num,len;
        binSearch BS = new binSearch(); 
        int arr[] = { 2, 3, 4, 10, 40,50,60,70,80 }; 
       len = arr.len; 
        num = 10; 
        int result = BS.binSearch(arr, 0, len - 1, num); 
        if (result == -1) 
            System.out.println("not prsent"); 
        else
            System.out.println("found on index " + result); 
    } 
}
