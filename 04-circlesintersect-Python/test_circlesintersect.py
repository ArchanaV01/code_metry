import os,sys
sys.path.append(os.getcwd())
from circlesintersect import fun_circlesintersect
import pytest


@pytest.mark.parametrize('check, result',[
    (fun_circlesintersect(5, 6, 14, 8, 7, 9), True), (fun_circlesintersect(-10, 8, 30, 14, -24, 10), True),
    (fun_circlesintersect(3, 4, 5, 14, 18, 8), False), (fun_circlesintersect(2, 3, 12, 15, 28, 10), False),
])
def test_fun_circlesintersect(check, result):
    assert check == result
