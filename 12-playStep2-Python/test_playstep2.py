import pytest
from playstep2 import playstep2
import os
import sys
sys.path.append(os.getcwd())


@pytest.mark.parametrize('a, b, check', [
    (413, 2312, (421, 23)),
    (413, 2345, (544, 23)),
    (544, 23, (443, 2)),
    (544, 456, (644, 45))
])
def test_playstep2(a, b, check):
    assert playstep2(a, b) == check
