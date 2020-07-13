import os,sys
sys.path.append(os.getcwd())
from rectangle_overlap import fun_rectangle_overlap
import pytest


@pytest.mark.parametrize('a,b,c,d,e,f,g,h, result',[
(0,2,1,4,1,6,8,4,True),(0,3,1,4,20,22,6,3,False),
(5,12,11,14,31,36,8,4, False),(0,0,1,4,1,4,1,2, True)
])
def test_fun_rectangle_overlap(a,b,c,d,e,f,g,h, result):
    assert fun_rectangle_overlap(a,b,c,d,e,f,g,h) == result

