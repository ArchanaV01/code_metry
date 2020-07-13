
import os,sys
sys.path.append(os.getcwd())
from linkedlist import LinkedList 
from linkedlist import Element 
import pytest

e1 = Element(1)
e2 = Element(2)
e3 = Element(3)

ll = LinkedList(e1)
ll.append(e2)
ll.append(e3)

@pytest.mark.parametrize("x,result",[(3,3),(2,2)])
def test_get_position(x,result):    
    assert ll.get_position(x).value == result

@pytest.mark.parametrize("position,result",[(3,4)])
def test_insert(position,result):
    e4 = Element(4)
    ll.insert(e4,3)
    assert ll.get_position(position).value == result


@pytest.mark.parametrize("val,result",[(1,2),(2,4),(3,3)])
def test_delete(val,result):
    ll.delete(1)
    assert ll.get_position(val).value == result

