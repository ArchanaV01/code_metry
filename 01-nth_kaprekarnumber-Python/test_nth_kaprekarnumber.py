import os,sys
sys.path.append(os.getcwd())
from nth_kaprekarnumber import fun_nth_kaprekarnumber
import pytest


@pytest.mark.parametrize('a, result',[
    (0,1),(1,9),(5,297),
(10,4879),(15,7777),(20,77778)
])
def test_fun_nth_kaprekarnumber(a, result):
    assert fun_nth_kaprekarnumber(a) == result

