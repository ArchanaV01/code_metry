import os,sys
sys.path.append(os.getcwd())
from nth_tidynumber import fun_nth_tidynumber
import pytest


@pytest.mark.parametrize('a, result',[
   (0, 1), (1, 2), (5, 6), (15, 17), (35, 46),
(50, 79), (100, 223), (250, 1156), (500, 2888),

])
def test_fun_nth_tidynumber(a, result):
    assert fun_nth_tidynumber(a) == result

