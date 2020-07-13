import os,sys
sys.path.append(os.getcwd())
from nth_fibonacci import fun_nthfibonaccinumber
import pytest


@pytest.mark.parametrize('a, result',[
    (0,1),(1,1),(2,2),(3,3),(4,5),(5,8),(6,13),(7,21),(8,34),(9,55),(10,89),(11,144)
])
def test_fun_nthfibonaccinumber(a, result):
    assert fun_nthfibonaccinumber(a) == result

