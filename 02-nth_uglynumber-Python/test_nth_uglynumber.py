import os,sys
sys.path.append(os.getcwd())
from nth_uglynumber import fun_nth_uglynumber
import pytest


@pytest.mark.parametrize('a, result',[
   (0, 1), (1, 2),(2, 3),(5, 6),(10, 15),
(25, 60), (50, 250),(100, 1600)

])
def test_fun_nth_uglynumber(a, result):
    assert fun_nth_uglynumber(a) == result

