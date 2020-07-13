import os,sys
sys.path.append(os.getcwd())
from carrylessadd import fun_carrylessadd
import pytest


@pytest.mark.parametrize('x, y, result',[
	(1, 2, 3),
	(785, 376, 51),
	(99, 1, 90),
	(33,77,0),
	(121,0,121)
	
])
def test_fun_carrylessadd(x, y, result):
    assert fun_carrylessadd(x, y) == result
