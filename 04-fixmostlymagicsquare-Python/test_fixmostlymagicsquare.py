
import os,sys
sys.path.append(os.getcwd())
from fixmostlymagicsquare import fixmostlymagicsquare
import pytest


@pytest.mark.parametrize("a, result",[
	([[2, 7, 9], [9, 5, 1], [4, 3, 8]], [[2, 7, 6], [9, 5, 1], [4, 3, 8]]),
	([[16, 3, 2, 13], [5, 10, 11, 18], [9, 6, 7, 12],[4, 15, 14, 1]], [[16, 3, 2, 13], [5, 10, 11, 8], [9, 6, 7, 12],[4, 15, 14, 1]])
])
def test_fixmostlymagicsquare(a, result):
	assert fixmostlymagicsquare(a) == result
