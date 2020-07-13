import os,sys
sys.path.append(os.getcwd())
from nth_happy_prime import fun_nth_happy_prime
import pytest


@pytest.mark.parametrize('a, result',[
    (0,7),(1,13),(2,19),(3,23),(4,31)
])
def test_fun_nth_happy_prime(a, result):
    assert fun_nth_happy_prime(a) == result

