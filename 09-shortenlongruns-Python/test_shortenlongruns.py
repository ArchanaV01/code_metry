
import os,sys
sys.path.append(os.getcwd())
from shortenlongruns import shortenlongruns
import pytest


@pytest.mark.parametrize("a, b, result",[
	([2, 3, 5, 5, 5, 3], 2, [2, 3, 5, 3]),
	([2, 3, 5, 5, 5, 3], 3, [2, 3, 5, 5, 3]),
])
def test_shortenlongruns(a, b, result):    
    assert shortenlongruns(a, b) == result
