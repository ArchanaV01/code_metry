import os,sys
sys.path.append(os.getcwd())
from largestperfectsquare import largestperfectsquare
import pytest


@pytest.mark.parametrize('n, result',[
	(24, 16),
	(25, 25),
	(26, 25),
	(14, 9),
	(2, 1),
	(5, 4)
])
def test_largestperfectsquare(n, result):
    assert largestperfectsquare(n) == result
