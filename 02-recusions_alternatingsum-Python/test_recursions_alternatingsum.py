import os,sys
sys.path.append(os.getcwd())
from recursions_alternatingsum import fun_recursions_alternatingsum
import pytest


@pytest.mark.parametrize('s1, result',[	
([5,3,8,4], 6), ([], 0), ([1,2,3,4], -2),
([99,56,23,98,45], 13), ([12,18,16,34,56], 32),
([81,23,90,134], 14)
])
def test_fun_recursions_alternatingsum(s1, result):
    assert fun_recursions_alternatingsum(s1) == result

