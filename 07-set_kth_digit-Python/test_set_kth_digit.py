import os,sys
sys.path.append(os.getcwd())
from set_kth_digit import fun_set_kth_digit
import pytest


@pytest.mark.parametrize('Number, k, digit, result',[
    (468, 0, 1, 461), (468, 1, 1, 418),
    (468, 2, 1, 168), (468, 3, 1, 1468),
    (-468, 3, 1, -1468)
])
def test_fun_set_kth_digit(Number, k, digit, result):
    assert fun_set_kth_digit(Number, k, digit) == result

