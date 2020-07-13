import os,sys
sys.path.append(os.getcwd())
from get_kth_digit import fun_get_kth_digit
import pytest


@pytest.mark.parametrize('Number, digit, result',[
    (789,0,9), (789,1,8),
    (789,2,7), (789,3,0),
    (-789,0,9), (-780,4,0),
])
def test_fun_get_kth_digit(Number, digit, result):
    assert fun_get_kth_digit(Number, digit) == result

