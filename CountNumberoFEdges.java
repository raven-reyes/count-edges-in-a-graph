import java.util.Vector;
// Given an adjacency list representation undirected graph.
// Write a function to count the number of edges in the undirected graph.
public class CountNumberoFEdges {
	static int V ;
	@SuppressWarnings("unchecked")
	static Vector<Integer> [] adjList = new Vector[V];
	@SuppressWarnings({ "unchecked", "static-access" })
	public CountNumberoFEdges(int V) {
		this.V = V;
		this.adjList = new Vector[V];
     for (int i = 0; i < V; i++) //an iteration to
     adjList[i] = new Vector<Integer>(); // create a vector for every vertex
	}
	// for undirected graph edges are added in both directions from i to j and from j to i 
	public static void addEdge(int i, int j){
		if(i < 0 || i >= V) {
			System.out.println("vertex " + i + " does not exist in this graph");
		}  if(j < 0 || j >= V) {
			System.out.println("vertex " + j + " does not exist in this graph");
		} else 
        adjList[i].add(j); // adding j in i's vector list
        adjList[j].add(i);  // adding i in j's vector list
    }
	public static int countEdges(){
        int sum = 0;
        // traverse all vertices
        for (int i = 0; i < V; i++)
            // add all edge that are linked to the
            // current vertex
            sum = sum + adjList[i].size();
        // The count of edge is always even because in
        // undirected graph every edge is connected
        // twice between two vertices
        return sum / 2;
    }
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		int V = 6;
       CountNumberoFEdges Graph  = new CountNumberoFEdges(V);
       Graph.addEdge( 1, 2);
       Graph.addEdge( 1, 3);
       Graph.addEdge( 2, 4);
       Graph.addEdge(2, 5);
       Graph.addEdge(3, 4);
       Graph.addEdge( 4, 6);
     
		System.out.println("the number of edges in this graph is: " + Graph.countEdges());

	}

}
