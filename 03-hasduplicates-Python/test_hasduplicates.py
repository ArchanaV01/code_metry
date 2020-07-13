import os,sys
sys.path.append(os.getcwd())
from hasduplicates import hasduplicates
import pytest


@pytest.mark.parametrize('s1, result',[	
	([[2, 7, 6], [9, 5, 1], [4, 3, 8]], False),
	([[2, 7, 9], [9, 5, 1], [4, 3, 8]], True),
	([[1, 2, 3], [4, 5, 6], [7, 8, 9]], False),
	([[16, 3, 2, 13], [5, 10, 11, 8], [9, 6, 7, 12],[4, 15, 14, 1]], False),
	([[16, 3, 2, 13], [5, 10, 11, 8], [9, 6, 7, 12],[4, 15, 14, 11]], True)
])
def test_hasduplicates(s1, result):
    assert hasduplicates(s1) == result

