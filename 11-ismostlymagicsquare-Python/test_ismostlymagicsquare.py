
import os,sys
sys.path.append(os.getcwd())
from ismostlymagicsquare import ismostlymagicsquare
import pytest


@pytest.mark.parametrize("a, result",[
	([[2, 7, 6], [9, 5, 1], [4, 3, 8]], True),
	([[1, 2, 3], [4, 5, 6], [7, 8, 9]], False),
	([[16, 3, 2, 13], [5, 10, 11, 8], [9, 6, 7, 12],[4, 15, 14, 1]], True)
])
def test_ismostlymagicsquare(a, result):
	assert ismostlymagicsquare(a) == result
