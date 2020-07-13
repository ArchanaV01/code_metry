import os,sys
sys.path.append(os.getcwd())
from nearestbusstop import fun_nearestbusstop
import pytest


@pytest.mark.parametrize('street, result',[
    (12, 8), (8, 8),
    (13, 16), (0, 0),
    (5, 8), (16, 16),
    (4, 0)
])
def test_fun_nearestbusstop(street, result):
    assert fun_nearestbusstop(street) == result

