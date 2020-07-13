import pytest
from lineintersection import lineintersection
import os
import sys
sys.path.append(os.getcwd())


@pytest.mark.parametrize('m1, b1, m2, b2, check', [
    (4, 13, 8, 17, None),
    (2, 13, 2, 14, None),
    (8, 13, 4, 17, None),
    (4, 13, 3, 17, 4),
    (4, 27, 9, 17, 2),
])
def test_lineintersection(m1, b1, m2, b2, check):
    assert lineintersection(m1, b1, m2, b2) == check
