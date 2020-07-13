import pytest
from isrighttriangle import isrighttriangle
import os
import sys
sys.path.append(os.getcwd())


@pytest.mark.parametrize('x, y, z, x1, y1, z1, check', [
	(13, -1, -9, 3, -3, -9, True),
	(6, 1, 0, 4, -1, -7, False),
	(1, 2, 5, 4, -3, 0, False),
	(-1, 7, 10, -4, 12, -2, True),
	(5, 4, 11, 6, 15, -6, True)
])
def test_isrighttriangle(x, y, z, x1, y1, z1, check):
    assert isrighttriangle(x, y, z, x1, y1, z1) == check
