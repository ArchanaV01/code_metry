import os,sys
sys.path.append(os.getcwd())
from ismultiple import fun_ismultiple
import pytest


@pytest.mark.parametrize('f, n, result',[
    (2,2, True), (2,5, False),
    (2,4, False), (0,6, True),
    (6,0, False), (0,0, True),
    (-2,4, False)
])
def test_fun_ismultiple(f,n, result):
    assert fun_ismultiple(f, n) == result

