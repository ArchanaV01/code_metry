import os,sys
sys.path.append(os.getcwd())
from find_int_roots import fun_find_int_roots
import pytest


@pytest.mark.parametrize('a,b,c, result',[
    (1, -5, 6, (2,3)),(1, -6, 8, (2,4)),
(1, 1, -12, (-4,3)),(1, -6, 5,(1,5)),
(1, 3, 2,(-2,-1))
])
def test_fun_find_int_roots(a, b, c, result):
    assert fun_find_int_roots(a, b, c) == result

