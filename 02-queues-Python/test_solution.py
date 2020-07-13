
import os,sys
sys.path.append(os.getcwd())
from queues import Queue  
import pytest

q = Queue(1)
q.enqueue(2)
q.enqueue(3)


@pytest.mark.parametrize("result",[(1)])
def test_peek1(result):    
    assert q.peek() == result
    

@pytest.mark.parametrize("result",[(1)])
def test_dequeue2(result):    
    assert q.dequeue() == result
    q.enqueue(4)

@pytest.mark.parametrize("result",[(2),(3),(4)])
def test_dequeue1(result):    
    assert q.dequeue() == result



@pytest.mark.parametrize("result",[(5)])
def test_peek2(result): 
    q.enqueue(5)   
    assert q.peek() == result

