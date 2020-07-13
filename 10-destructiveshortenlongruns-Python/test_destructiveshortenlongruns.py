
import os,sys
sys.path.append(os.getcwd())
from destructiveshortenlongruns import destructiveshortenlongruns
import pytest


@pytest.mark.parametrize("a, b, result",[
	([2, 3, 5, 5, 5, 3], 2, [2, 3, 5, 3]),
	([2, 3, 5, 5, 5, 3], 3, [2, 3, 5, 5, 3]),
])
def test_destructiveshortenlongruns(a, b, result):    
    assert destructiveshortenlongruns(a, b) == result
