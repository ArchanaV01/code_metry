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
      Graph_Representation graph = new Graph_Representation();
      graph.insert_edge(100, 1, 2);
      graph.insert_edge(101, 1, 3);
      graph.insert_edge(102, 1, 4);
      graph.insert_edge(103, 3, 4);
      ArrayList<ArrayList<Integer>> r= graph.get_edge_list();
      ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
      ArrayList<Integer> a1 = new ArrayList<Integer>();
      a1.add(100);a1.add(1);a1.add(2);a.add(a1);
      a1 = new ArrayList<Integer>();a1.add(101);a1.add(1);a1.add(3);a.add(a1);
      a1 = new ArrayList<Integer>();a1.add(102);a1.add(1);a1.add(4);a.add(a1);
      a1 = new ArrayList<Integer>();a1.add(103);a1.add(3);a1.add(4);a.add(a1);
      assertEquals("0.", a.size(), r.size());
      for(int i = 0; i < a.size(); i++){
          assertEquals((i+"."), a.get(i).toString(), r.get(i).toString());
      }
   }

   @Test
   public void testCase2(){
      Graph_Representation graph = new Graph_Representation();
      graph.insert_edge(100, 1, 2);
      graph.insert_edge(101, 1, 3);
      graph.insert_edge(102, 1, 4);
      graph.insert_edge(103, 3, 4);
      ArrayList<ArrayList<Integer>> r= graph.get_adjacency_list();
      ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
      ArrayList<Integer> a1 = new ArrayList<Integer>();
      a.add(a1);
      a1 = new ArrayList<Integer>();a1.add(2);a1.add(3);a1.add(4);a.add(a1);
      a1 = new ArrayList<Integer>();a.add(a1);
      a1 = new ArrayList<Integer>();a1.add(4);a.add(a1);
      a1 = new ArrayList<Integer>();a.add(a1);
      assertEquals("0.", a.size(), r.size());
      for(int i = 0; i < a.size(); i++){
          assertEquals((i+"."), a.get(i).toString(), r.get(i).toString());
      }
   }

   @Test
   public void testCase3(){
      Graph_Representation graph = new Graph_Representation();
      graph.insert_edge(100, 1, 2);
      graph.insert_edge(101, 1, 3);
      graph.insert_edge(102, 1, 4);
      graph.insert_edge(103, 3, 4);
      ArrayList<ArrayList<Integer>> r= graph.get_adjacency_matrix();
      ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
      ArrayList<Integer> a1 = new ArrayList<Integer>();
      a1.add(0);a1.add(0);a1.add(0);a1.add(0);a1.add(0);a.add(a1);
      a1 = new ArrayList<Integer>();a1.add(0);a1.add(0);a1.add(100);a1.add(101);a1.add(102);a.add(a1);
      a1 = new ArrayList<Integer>();a1.add(0);a1.add(0);a1.add(0);a1.add(0);a1.add(0);a.add(a1);
      a1 = new ArrayList<Integer>();a1.add(0);a1.add(0);a1.add(0);a1.add(0);a1.add(103);a.add(a1);
      a1 = new ArrayList<Integer>();a1.add(0);a1.add(0);a1.add(0);a1.add(0);a1.add(0);a.add(a1);
      assertEquals("0.", a.size(), r.size());
      for(int i = 0; i < a.size(); i++){
          assertEquals((i+"."), a.get(i).toString(), r.get(i).toString());
      }
   }

   
}