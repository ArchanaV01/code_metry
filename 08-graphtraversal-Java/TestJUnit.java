/**
 * This is JUnit that tests the methods of the Clock.
 * This contains 2 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and 
 * paste the last three lines of the code (TestCase2).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.beans.Transient;
import java.util.*;
public class TestJUnit {


   @Test
   public void testCase1() {
      Graph_Traversal graph = new Graph_Traversal();
      ArrayList<String> input = new ArrayList<String>(Arrays.asList("Mountain View", "San Francisco", "London", "Shanghai", "Berlin", "Sao Paolo", "Bangalore"));
      graph.set_node_names(input);       

      graph.insert_edge(51, 0, 1);     // MV <-> SF
      graph.insert_edge(51, 1, 0);     // SF <-> MV
      graph.insert_edge(9950, 0, 3);   // MV <-> Shanghai
      graph.insert_edge(9950, 3, 0);   // Shanghai <-> MV
      graph.insert_edge(10375, 0, 5);  // MV <-> Sao Paolo
      graph.insert_edge(10375, 5, 0);  // Sao Paolo <-> MV
      graph.insert_edge(9900, 1, 3);   // SF <-> Shanghai
      graph.insert_edge(9900, 3, 1);   // Shanghai <-> SF
      graph.insert_edge(9130, 1, 4);   // SF <-> Berlin
      graph.insert_edge(9130, 4, 1);   // Berlin <-> SF
      graph.insert_edge(9217, 2, 3);   // London <-> Shanghai
      graph.insert_edge(9217, 3, 2);   // Shanghai <-> London
      graph.insert_edge(932, 2, 4);    // London <-> Berlin
      graph.insert_edge(932, 4, 2);    // Berlin <-> London
      graph.insert_edge(9471, 2, 5);   // London <-> Sao Paolo
      graph.insert_edge(9471, 5, 2);   // Sao Paolo <-> London
      
      ArrayList<String> r = graph.dfs_names(2);
      ArrayList<String> a = new ArrayList<String>(Arrays.asList("London", "Shanghai", "Mountain View", "San Francisco", "Berlin", "Sao Paolo"));
      assertEquals("0.", a.size(), r.size());

      for(int i = 0; i < a.size(); i++){
          assertEquals((i+"."), a.get(i), r.get(i));
      }
   }

   @Test
   public void testCase2() {
      Graph_Traversal graph = new Graph_Traversal();
      ArrayList<String> input = new ArrayList<String>(Arrays.asList("Mountain View", "San Francisco", "London", "Shanghai", "Berlin", "Sao Paolo", "Bangalore"));
      graph.set_node_names(input);       

      graph.insert_edge(51, 0, 1);     // MV <-> SF
      graph.insert_edge(51, 1, 0);     // SF <-> MV
      graph.insert_edge(9950, 0, 3);   // MV <-> Shanghai
      graph.insert_edge(9950, 3, 0);   // Shanghai <-> MV
      graph.insert_edge(10375, 0, 5);  // MV <-> Sao Paolo
      graph.insert_edge(10375, 5, 0);  // Sao Paolo <-> MV
      graph.insert_edge(9900, 1, 3);   // SF <-> Shanghai
      graph.insert_edge(9900, 3, 1);   // Shanghai <-> SF
      graph.insert_edge(9130, 1, 4);   // SF <-> Berlin
      graph.insert_edge(9130, 4, 1);   // Berlin <-> SF
      graph.insert_edge(9217, 2, 3);   // London <-> Shanghai
      graph.insert_edge(9217, 3, 2);   // Shanghai <-> London
      graph.insert_edge(932, 2, 4);    // London <-> Berlin
      graph.insert_edge(932, 4, 2);    // Berlin <-> London
      graph.insert_edge(9471, 2, 5);   // London <-> Sao Paolo
      graph.insert_edge(9471, 5, 2);   // Sao Paolo <-> London
      
      ArrayList<String> r = graph.bfs_names(2);
      ArrayList<String> a = new ArrayList<String>(Arrays.asList("London", "Shanghai", "Berlin", "Sao Paolo", "Mountain View", "San Francisco"));
      assertEquals("0.", a.size(), r.size());

      for(int i = 0; i < a.size(); i++){
          assertEquals((i+"."), a.get(i), r.get(i));
      }
   }   
}