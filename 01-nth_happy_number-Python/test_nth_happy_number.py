import os,sys
sys.path.append(os.getcwd())
from nth_happy_number import fun_nth_happy_number
import pytest


@pytest.mark.parametrize('a, result',[
    (0,1),(1,7),(2,10),(3,13),(4,19),(5,23),(6,28),(7,31)
])
def test_fun_nth_happy_number(a, result):
    assert fun_nth_happy_number(a) == result

