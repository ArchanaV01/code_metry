
import os,sys
sys.path.append(os.getcwd())
from inverselookandsay import inverselookandsay
import pytest


@pytest.mark.parametrize("a, result",[
	([(2,3),(1,8),(3,-10)] , [3,3,8,-10,-10,-10]), 
	([(3,1)] , [1,1,1]), 
	([(1,-1),(1,2),(1,7)] , [-1,2,7]), 
	([(2,3),(1,8),(3,-10)] , [3,3,8,-10,-10,-10]), 
	([(2,3),(1,8),(4,3)] , [3,3,8,3,3,3,3]),
	( [(),], [])
])
def test_inverselookandsay(a, result):
    assert inverselookandsay(a) == result
