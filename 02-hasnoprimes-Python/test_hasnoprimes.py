import os,sys
sys.path.append(os.getcwd())
from hasnoprimes import fun_hasnoprimes
import pytest


@pytest.mark.parametrize('s1, result',[	
([[12,4,6],[8,12,14],[6,18]], True), ([[2]], False),
([[9,12],[8],[16,8]], True),([[9,12],[8],[16,8,19]],False) 
])
def test_fun_hasnoprimes(s1, result):
    assert fun_hasnoprimes(s1) == result

