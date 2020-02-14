package bfs;
import java.util.Iterator;
import java.util.LinkedList;

public class bfs {

    private int Ver;   /* Number of vertices */
    
    private LinkedList<Integer> arr[];
    
    
    
    public bfs(int ver) 
    
    { 
        Ver = ver; 
        arr = new LinkedList[ver]; 
        for (int b=0; b<ver; ++b) 
            arr[b] = new LinkedList(); 
    } 
    void BFS(int a) 
    { 
        boolean v[] = new boolean[Ver]; 
  
        LinkedList<Integer> k = new LinkedList<Integer>(); 
  
     
        v[a]=true; 
        k.add(a); 
  
        while (k.size() != 0) 
        { 
            
            a = k.poll(); 
            System.out.print(a+" "); 
  
          
            Iterator<Integer> i = arr[a].listIterator(); 
            while (i.hasNext()) 
            { 
                int p = i.next(); 
                if (!v[p]) 
                { 
                    v[p] = true; 
                    k.add(p); 
                } 
            } 
        } 
    } 
    public static void main(String[] args) {
      bfs h = new bfs(4);
 
        h.addEdge(4, 1);
        h.addEdge(1, 3);
        h.addEdge(5, 0);
        h.addEdge(2, 3);
        h.addEdge(1, 2);
        h.addEdge(4, 4);
 
        System.out.println("Breadth of first traversal ");
 
        h.BFS(2);
    }
	    
	    void addEdge(int no_ver,int widthOfUndirectedGraph) 
	    { 
	        arr[no_ver].add(widthOfUndirectedGraph); 
	    } 

}
