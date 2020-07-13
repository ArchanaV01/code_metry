
import os,sys
sys.path.append(os.getcwd())
from Graph_Traversal import Graph 
import pytest

graph = Graph()
graph.set_node_names(('Mountain View', 'San Francisco', 'London', 'Shanghai', 'Berlin', 'Sao Paolo', 'Bangalore'))       

graph.insert_edge(51, 0, 1)     # MV <-> SF
graph.insert_edge(51, 1, 0)     # SF <-> MV
graph.insert_edge(9950, 0, 3)   # MV <-> Shanghai
graph.insert_edge(9950, 3, 0)   # Shanghai <-> MV
graph.insert_edge(10375, 0, 5)  # MV <-> Sao Paolo
graph.insert_edge(10375, 5, 0)  # Sao Paolo <-> MV
graph.insert_edge(9900, 1, 3)   # SF <-> Shanghai
graph.insert_edge(9900, 3, 1)   # Shanghai <-> SF
graph.insert_edge(9130, 1, 4)   # SF <-> Berlin
graph.insert_edge(9130, 4, 1)   # Berlin <-> SF
graph.insert_edge(9217, 2, 3)   # London <-> Shanghai
graph.insert_edge(9217, 3, 2)   # Shanghai <-> London
graph.insert_edge(932, 2, 4)    # London <-> Berlin
graph.insert_edge(932, 4, 2)    # Berlin <-> London
graph.insert_edge(9471, 2, 5)   # London <-> Sao Paolo
graph.insert_edge(9471, 5, 2)   # Sao Paolo <-> London



@pytest.mark.parametrize("start,result",[(2, ['London', 'Shanghai', 'Mountain View', 'San Francisco', 'Berlin', 'Sao Paolo'])])
def test_dfs_names(start, result):    
    assert graph.dfs_names(start) == result


@pytest.mark.parametrize("start,result",[(2, ['London', 'Shanghai', 'Berlin', 'Sao Paolo', 'Mountain View', 'San Francisco'])])
def test_bfs_names(start, result):    
    assert graph.bfs_names(start) == result

