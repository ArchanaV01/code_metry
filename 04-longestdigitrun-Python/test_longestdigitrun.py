import os,sys
sys.path.append(os.getcwd())
from longestdigitrun import longestdigitrun
import pytest


@pytest.mark.parametrize('x, result',[
    (117773732, 7), 
    (-677886, 7), 
    (112233455567, 5), 
    (44332211, 1), 
    (4422113355, 1),
    (12345, 1), 
    (123330001, 0)
])

def test_longestdigitrun(x, result):
    assert longestdigitrun(x) == result
