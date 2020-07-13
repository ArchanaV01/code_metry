import os,sys
sys.path.append(os.getcwd())
from getaverage import fun_getaverage
import pytest


@pytest.mark.parametrize('s1, result',[	
("13,excused,14,absent", 13.5), ("a,b,c",0.0),
("a,12,c,14,6,0", 8.0), ("1,2,3,4,5,6,7,8,9,10", 5.5),
("2,3,ddd4ff,34,1", 10.0)
])
def test_fun_getaverage(s1, result):
    assert fun_getaverage(s1) == result

