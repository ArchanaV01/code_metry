import os,sys
sys.path.append(os.getcwd())
from nearestkaprekarnumber import fun_nearestkaprekarnumber
import pytest


@pytest.mark.parametrize('a, result',[
    (49, 45), (51, 55), (50, 45),
(102, 99),(765, 703),(3861, 4879)

])
def test_fun_nearestkaprekarnumber(a, result):
    assert fun_nearestkaprekarnumber(a) == result

