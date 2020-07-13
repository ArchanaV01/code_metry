
import os,sys
sys.path.append(os.getcwd())
from issorted import issorted
import pytest


@pytest.mark.parametrize("input_value, result",[
	([1, 2, 3, 4, 5], True),
	([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], True),
	([1], True),
	([1, 1], True),
	([], True),
	([10, 9, 8, 7, 6, 5, 4, 3, 2, 1], True),
	([10, 9, 8, 7, 6, 5, 4, 3, 2, 10], False),
	([1, 2, 3, 4, 5.5, 5.1, 7, 8, 9, 10], False),
	([1, 2, 3, 4, 5.5, 5.5, 5.5, 5.5, -1, 10], False),
	([10, -1, 5.5, 5.5, 5.5, 4, 3, 2, 1], False),
	([-1, 0, -1.1], False),
])
def test_issorted(input_value, result):    
    assert issorted(input_value) == result
