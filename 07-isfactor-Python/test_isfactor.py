import os,sys
sys.path.append(os.getcwd())
from isfactor import fun_isfactor
import pytest


@pytest.mark.parametrize('f, n, result',[
    (2,2, True), (2,5, False),
    (2,4, True), (0,6, False),
    (6,0, True), (0,0, True),
    (-2,4, True)
])
def test_fun_isfactor(f,n, result):
    assert fun_isfactor(f, n) == result

