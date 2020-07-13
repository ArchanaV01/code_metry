import java.util.*;
class Node{
	int value;
	ArrayList<Edge> edges;
	boolean visited;
	Node(int value){
		this.value = value;
		edges = new ArrayList<Edge>();
		this.visited = false;
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

public class Graph_Traversal{
	ArrayList<Node> nodes;
	ArrayList<Edge> edges;
	ArrayList<String> node_names;
	HashMap<Integer, Node> node_map;
	Graph_Traversal(){
		this.nodes = new ArrayList<Node>();
		this.edges = new ArrayList<Edge>();
		this.node_names = new ArrayList<String>();
		this.node_map = new HashMap<Integer, Node>();
	}

	public void set_node_names( ArrayList<String> names){
		this.node_names = names;
	}

	public Node insert_node(int value){
		Node new_node = new Node(value);
		this.nodes.add(new_node);
		this.node_map.put(new Integer(value),new_node);
		return new_node;
	}

	public void insert_edge(int val, int node_from_val, int node_to_val){
		HashMap<Integer, Node> node = new HashMap<Integer, Node>();
		node.put(new Integer(node_from_val),null);
		node.put(new Integer(node_to_val), null);
		for(int i = 0; i < this.nodes.size(); i++){
			if (node.containsKey(this.nodes.get(i).value)){
				node.put(new Integer(this.nodes.get(i).value), this.nodes.get(i));
				if(node.get(node_from_val) != null && node.get(node_to_val) != null)
					break;
			}
		}
		node.forEach((k, v) -> { 
  			if(node.get(k) == null){
  				node.put(k, this.insert_node(k));
  			}
        }); 
		Node node_from = node.get(node_from_val);
		Node node_to = node.get(node_to_val);
		Edge new_edge = new Edge(val, node_from, node_to);
		node_from.edges.add(new_edge);
		node_to.edges.add(new_edge);
		this.edges.add(new_edge);
	}
	public Node find_node(int node_number){
		// "Return the node with value node_number or None"
        return this.node_map.get(node_number);
	}

	public void clear_visited(){
		for(int i = 0; i < this.nodes.size(); i++){
			this.nodes.get(i).visited = false;
		}
	}

	public ArrayList<Integer> dfs_helper(Node start_node){
		// """TODO: Write the helper function for a recursive implementation
        // of Depth First Search iterating through a node's edges. The
        // output should be a list of numbers corresponding to the
        // values of the traversed nodes.
        // ARGUMENTS: start_node is the starting Node
        // MODIFIES: the value of the visited property of nodes in self.nodes 
        // RETURN: a list of the traversed node values (integers).
        // """
        return ArrayList<integer>();
		
	}

	public ArrayList<Integer> dfs(int start_node_num){
		// """Outputs a list of numbers corresponding to the traversed nodes
        // in a Depth First Search.
        // ARGUMENTS: start_node_num is the starting node number (integer)
        // MODIFIES: the value of the visited property of nodes in self.nodes
        // RETURN: a list of the node values (integers)."""
		this.clear_visited();
		Node start_node = this.find_node(start_node_num);
		return this.dfs_helper(start_node);
	}

	public ArrayList<String> dfs_names(int start_node_num){
		// """Return the results of dfs with numbers converted to names."""
        ArrayList<Integer> arr = this.dfs(start_node_num);
		ArrayList<String> res = new ArrayList<String>();
		for(int i = 0; i < arr.size(); i++){
			res.add(this.node_names.get(arr.get(i)));
		}
		return res;
	}

	public ArrayList<Integer> bfs(int start_node_num) {
		// """TODO: Create an iterative implementation of Breadth First Search
        // iterating through a node's edges. The output should be a list of
        // numbers corresponding to the traversed nodes.
        // ARGUMENTS: start_node_num is the node number (integer)
        // MODIFIES: the value of the visited property of nodes in self.nodes
        // RETURN: a list of the node values (integers)."""
        return new ArrayList();

	}

	public ArrayList<String> bfs_names(int start_node_num){
        // """Return the results of bfs with numbers converted to names."""
		ArrayList<Integer> arr = this.bfs(start_node_num);
		ArrayList<String> res = new ArrayList<String>();
		for(int i = 0; i < arr.size(); i++){
			res.add(this.node_names.get(arr.get(i)));
		}
		return res;
	}	
}