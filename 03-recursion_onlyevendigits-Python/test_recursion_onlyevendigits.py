import os,sys
sys.path.append(os.getcwd())
from recursion_onlyevendigits import fun_recursion_onlyevendigits
import pytest


@pytest.mark.parametrize('s1, result',[	
([43, 23265, 17, 58344], [4, 226, 0, 844]),
([5, 0 , 66, 82, 121], [0, 0, 66, 82, 2]),
([],[]), ([332, 81, 11], [2, 8, 0])

])
def test_fun_recursion_onlyevendigits(s1, result):
    assert fun_recursion_onlyevendigits(s1) == result

