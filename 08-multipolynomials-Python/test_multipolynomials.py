
import os,sys
sys.path.append(os.getcwd())
from multipolynomials import multipolynomials
import pytest


@pytest.mark.parametrize("a, b, result",[
	([1, 1], [1, -1], [1, 0, -1]),
	([1, 1], [1, 1], [1, 2, 1]),
	([1, -1], [1, -1], [1, -2, 1]),
	([1], [1], [1]),
	([1, 0], [1, 1], [1, 1, 0]),
	([1, 1, 1], [1, 0], [1, 1, 1, 0]), 
])
def test_multipolynomials(a, b, result):
    assert multipolynomials(a, b) == result
