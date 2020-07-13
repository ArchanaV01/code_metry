import pytest
from isevenpositiveint import isevenpositiveint
import os
import sys
sys.path.append(os.getcwd())


@pytest.mark.parametrize('x, check', [
    (1, False),
    (-1, False),
    (-2, False),
    (-3, False),
    (2, True),
    (3, False),
    (1.0, False),
    ("yikes!", False),
    (None, False),
    ((12), False),
    ([12], False),
    (123456, True)
])
def test_isevenpositiveint(x, check):
    assert isevenpositiveint(x) == check
