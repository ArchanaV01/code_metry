import os,sys
sys.path.append(os.getcwd())
from nth_palindromic_prime import fun_nth_palindromic_prime
import pytest


@pytest.mark.parametrize('a, result',[
    (0,2),(1,3),(10,313),(15,757),(20,10301),(25,12421)
])
def test_fun_nth_palindromic_prime(a, result):
    assert fun_nth_palindromic_prime(a) == result


