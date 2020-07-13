import os,sys
sys.path.append(os.getcwd())
from isrectangular import fun_isrectangular
import pytest


@pytest.mark.parametrize('s1, result',[	
([[1, 2, 3], [1, 1]], False), ([[1, 2, 3], [1, 1, 2]], True),
([[], []], True), ([[1, 2], [1, 1], [1, 2, 3]], False)

])
def test_fun_isrectangular(s1, result):
    assert fun_isrectangular(s1) == result

