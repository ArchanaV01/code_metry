
import os,sys
sys.path.append(os.getcwd())
from recursion_powersof3ton import recursion_powersof3ton
import pytest


@pytest.mark.parametrize("a, result",[
	(0, None), (-42, None),
	(0.99, None), (1, [1]),
	(3, [1, 3]), (8.9999, [1, 3]),
	(9, [1, 3, 9]), (9.1111, [1, 3, 9]),
	(100, [1, 3, 9, 27, 81])
])
def test_recursion_powersof3ton(a, result):
	assert recursion_powersof3ton(a) == result