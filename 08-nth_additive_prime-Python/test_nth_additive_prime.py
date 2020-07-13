import os,sys
sys.path.append(os.getcwd())
from nth_additive_prime import fun_nth_additive_prime
import pytest


@pytest.mark.parametrize('a, result',[
    (0,2),(1,3),(5,23),(7,41),(20,157),(25,197)
])
def test_fun_nth_additive_prime(a, result):
    assert fun_nth_additive_prime(a) == result

