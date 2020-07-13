import java.util.*;
class Node{
	int value;
	ArrayList<Edge> edges;
	Node(int value){
		this.value = value;
		edges = new ArrayList<Edge>();
	}
} 

class Edge{
	int value;
	Node node_from;
	Node node_to;
	Edge(int value,Node node_from, Node node_to){
		this.value = value;
		this.node_from = node_from;
		this.node_to = node_to;
	}
}

public class Graph_Representation{
	ArrayList<Node> nodes;
	ArrayList<Edge> edges;
	Graph_Representation(){
		this.nodes = new ArrayList<Node>();
		this.edges = new ArrayList<Edge>();
	}

	public void insert_node(int value){
		Node new_node = new Node(value);
		this.nodes.add(new_node);
	}

	public void insert_edge(int val, int node_from_val, int node_to_val){
		Node from_found = null;
		Node to_found = null;
		for(int i = 0; i < this.nodes.size(); i++){
			if(node_from_val == nodes.get(i).value){
				from_found = nodes.get(i);
			}
			if(node_to_val == nodes.get(i).value){
				to_found = nodes.get(i);
			}
		}
		if(from_found == null){
			from_found = new Node(node_from_val);
			this.nodes.add(from_found);
		}
		if(to_found == null){
			to_found = new Node(node_to_val);
			this.nodes.add(to_found);
		}
		Edge new_edge = new Edge(val, from_found, to_found);
		from_found.edges.add(new_edge);
		to_found.edges.add(new_edge);
		this.edges.add(new_edge);

	}

	public ArrayList<ArrayList<Integer>> get_edge_list(){
		// """Don't return a list of edge objects!
        // Return a list of list that looks like this:
        // [Edge Value, From Node Value, To Node Value]"""
        ArrayList<ArrayList<Integer>> r = new ArrayList<ArrayList<Integer>>();
        return r;
	}

	public ArrayList<ArrayList<Integer>> get_adjacency_list(){
		// """Don't return any Node or Edge objects!
        // You'll return a list of lists.
        // The indecies of the outer list represent
        // "from" nodes.
        // Each section in the list will store a list of To Node
		ArrayList<ArrayList<Integer>> r = new ArrayList<ArrayList<Integer>>();
		return r;

	}

	public ArrayList<ArrayList<Integer>> get_adjacency_matrix(){
		// """Return a matrix, or 2D list.
        // Row numbers represent from nodes,
        // column numbers represent to nodes.
        // Store the edge values in each spot,
        // and a 0 if no edge exists."""
		
		ArrayList<ArrayList<Integer>> r = new ArrayList<ArrayList<Integer>>();
		return r;


	}
}