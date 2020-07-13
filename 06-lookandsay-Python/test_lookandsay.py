
import os,sys
sys.path.append(os.getcwd())
from lookandsay import lookandsay
import pytest


@pytest.mark.parametrize("a, result",[
	([], []), ([1, 1, 1], [(3, 1)]), 
	([-1, 2, 7], [(1, -1), (1, 2), (1, 7)]), ([3,3,8,-10,-10,-10], [(2,3),(1,8),(3,-10)]), 
	([3,3,8,3,3,3,3], [(2,3),(1,8),(4,3)])
])
def test_lookandsay(a, result):
    assert lookandsay(a) == result
