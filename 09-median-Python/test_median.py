
import os,sys
sys.path.append(os.getcwd())
from median import median
import pytest


@pytest.mark.parametrize("input_value, result",[
	([1, 2, 3, 4, 5], 3),
	([1.1, 2.1, 3.1, 4.1, 5.1], 3.1),
	([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], 5.5),
	([1, 2, 3, 4, 5.5, 5.1, 7, 8, 9, 10], 5.3),
	([1], 1),
	([], None)
])
def test_median(input_value, result):    
    assert median(input_value) == result
