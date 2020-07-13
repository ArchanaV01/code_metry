
import os,sys
sys.path.append(os.getcwd())
from recursion_secondlargest import recursion_secondlargest
import pytest


@pytest.mark.parametrize("value, result",[
	([1,2,3,4,5], 4),
	([4,3], 3),
	([4,4,3], 4),
	([-3,-4], -4),
	([4], None),
	([ ], None)
])
def test_recursion_secondlargest(value, result):
	assert recursion_secondlargest(value) == result

