
import os,sys
sys.path.append(os.getcwd())
from quicksort import quicksort
import pytest

@pytest.mark.parametrize("input_value, result",[([21, 4, 1, 3, 9, 20, 25, 6, 21, 14],[1, 3, 4, 6, 9, 14, 20, 21, 21, 25])])
def test_quicksort(input_value, result):    
    assert quicksort(input_value) == result

