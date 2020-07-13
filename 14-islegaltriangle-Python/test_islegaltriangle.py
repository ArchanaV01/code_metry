import pytest
from islegaltriangle import islegaltriangle
import os
import sys
sys.path.append(os.getcwd())


@pytest.mark.parametrize('x, y, z, check', [
    (1, 2, 3, False),
    (7, 10, 5, True),
    (1, 10, 12, False),
    (1.1, 2.1, 3.2, False),
    (7.9, 10.1, 5.9, True),
    (1.00012, 10.0009090, 12.0000001, False)
])
def test_islegaltriangle(x, y, z, check):
    assert islegaltriangle(x, y, z) == check
