
import os,sys
sys.path.append(os.getcwd())
from findzerowithbisection import findzerowithbisection
import pytest


@pytest.mark.parametrize("a, epsilon, result",[
	(25, 0.01, 5.00030517578125), (49, 0.01, 6.999786376953125),
	(81, 0.01, 9.000274658203125)
])
def test_findzerowithbisection(a, epsilon, result):
	assert findzerowithbisection(a, epsilon) == result
