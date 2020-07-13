import os,sys
sys.path.append(os.getcwd())
from threelines_area import fun_threelines_area
import pytest


@pytest.mark.parametrize('a,b,c, result',[
    (5, 3, 4, 6), (4, 4, 3, 5),
(12, 10, 8, 39), (16, 12, 11, 65)
])
def test_fun_threelines_area(a,b,c, result):
    assert fun_threelines_area(a,b,c) == result

