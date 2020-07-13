
import os,sys
sys.path.append(os.getcwd())
from Graph_Representation import Graph 
import pytest

graph = Graph()
graph.insert_edge(100, 1, 2)
graph.insert_edge(101, 1, 3)
graph.insert_edge(102, 1, 4)
graph.insert_edge(103, 3, 4)


@pytest.mark.parametrize("result",[([(100, 1, 2), (101, 1, 3), (102, 1, 4), (103, 3, 4)])])
def test_get_edge_list(result):    
    assert graph.get_edge_list() == result

@pytest.mark.parametrize("result",[([None, [(2, 100), (3, 101), (4, 102)], None, [(4, 103)], None])])
def test_get_adjacency_list(result):    
    assert graph.get_adjacency_list() == result

@pytest.mark.parametrize("result",[([[0, 0, 0, 0, 0], [0, 0, 100, 101, 102], [0, 0, 0, 0, 0], [0, 0, 0, 0, 103], [0, 0, 0, 0, 0]])])
def test_get_adjacency_matrix(result):    
    assert graph.get_adjacency_matrix() == result

