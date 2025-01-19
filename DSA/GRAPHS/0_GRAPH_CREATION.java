import java.util.* ; 


class Graph { 
public Map<Integer,List<List<Integer>>> adj = new HashMap<>() ; //  [1:[[2,0],[3,4]]]
    public Graph(int n) {
        for(int i = 1 ; i <= n ; i++) {
            adj.putIfAbsent(i,new ArrayList<>()) ; 
        }
    }
    public void addEdge(int u , int v , int weight ) { // Undirected
        List<Integer> edges1 = new ArrayList<>() ; 
        edges1.add(v) ; 
        edges1.add(weight) ; 
        adj.get(u).add(edges1) ; 
        List<Integer> edges2 = new ArrayList<>() ; 
        edges2.add(u) ; 
        edges2.add(weight) ; 
        adj.get(v).add(edges2) ; 
    }
    public void display() {
        for(int i: adj.keySet()) {
            System.out.println() ; 
            System.out.print(i+" : [") ; 
            for(List j : adj.get(i)) {
                System.out.print("[") ;
                System.out.print(j.get(0)+",") ;
                System.out.print(j.get(1)) ; 
                System.out.print("]") ;
            }
            System.out.print("]") ; 
            
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() , m = sc.nextInt(); 
        Graph g = new Graph(n) ; // nodes will be from 0 , 1 , 2 :=> 0=1 , 1=2 , 2=3
        for(int i = 0 ; i < m ; i++) {
            int u = sc.nextInt() , v = sc.nextInt() , weight = sc.nextInt() ; 
            g.addEdge(u,v,weight) ; 
        }
        g.display() ; 
        
    }
}

// // undirected
// n = 3 , m = 2 ;
// 1 2 0         // u v weight
// 1 3 4
// nodes start from 1 upto n ;


// DISPLAY : 
import java.util.* ; 


class Graph { 
public Map<Integer,List<List<Integer>>> adj = new HashMap<>() ; //  [1:[[2,0],[3,4]]]
    public Graph(int n) {
        for(int i = 1 ; i <= n ; i++) {
            adj.putIfAbsent(i,new ArrayList<>()) ; 
        }
    }
    public void addEdge(int u , int v , int weight ) {
        List<Integer> edges1 = new ArrayList<>() ; 
        edges1.add(v) ; 
        edges1.add(weight) ; 
        adj.get(u).add(edges1) ; 
        List<Integer> edges2 = new ArrayList<>() ; 
        edges2.add(u) ; 
        edges2.add(weight) ; 
        adj.get(v).add(edges2) ; 
    }
    public void display() {
        for(int i: adj.keySet()) {
            System.out.println() ; 
            System.out.print(i+" : [") ; 
            for(List j : adj.get(i)) {
                System.out.print("[") ;
                System.out.print(j.get(0)+",") ;
                System.out.print(j.get(1)) ; 
                System.out.print("]") ;
            }
            System.out.print("]") ; 
            
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() , m = sc.nextInt(); 
        Graph g = new Graph(n) ; // nodes will be from 0 , 1 , 2 :=> 0=1 , 1=2 , 2=3
        for(int i = 0 ; i < m ; i++) {
            int u = sc.nextInt() , v = sc.nextInt() , weight = sc.nextInt() ; 
            g.addEdge(u,v,weight) ; 
        }
        g.display() ; 
        
    }
}

// // undirected
// n = 3 , m = 2 ;
// 1 2 0         // u v weight
// 1 3 4
// nodes start from 1 upto n ;

// DISPLAY 
// 3 2 
// 1 2 0
// 1 3 4
// 1 : [[2,0] [3,4]]
// 2 : [[1,0]] 
// 3 : [[1,4]]