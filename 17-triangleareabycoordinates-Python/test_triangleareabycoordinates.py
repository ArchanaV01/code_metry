import pytest
from triangleareabycoordinates import triangleareabycoordinates
import os
import sys
sys.path.append(os.getcwd())


@pytest.mark.parametrize('x, y, z, x1, y1, z1, check', [
	(23, 30, 15, 15, 50, 25, 222.50),
	(23, 30, 15, 15, 32, 15, 127.50),
	(15, 35, 15, 15, 32, 15, 170),
	(25, 35, 15, 15, 34, 15, 190),
	(25, 17, 15, 15, 34, 15, 19)
])
def test_triangleareabycoordinates(x, y, z, x1, y1, z1, check):
    assert round(triangleareabycoordinates(x, y, z, x1, y1, z1), 2) == check
