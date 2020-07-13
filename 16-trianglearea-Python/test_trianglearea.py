import pytest
from trianglearea import trianglearea
import os
import sys
sys.path.append(os.getcwd())


@pytest.mark.parametrize('x, y, z, check', [
	(4, 13, 15, 24),
	(24, 18, 30, 216),
	(4, 5, 3, 6),
	(10, 10, 10, 43.30127018922193),
	(10, 10.5, 10, 44.682866892691656)
])
def test_trianglearea(x, y, z, check):
    assert trianglearea(x, y, z) == check
