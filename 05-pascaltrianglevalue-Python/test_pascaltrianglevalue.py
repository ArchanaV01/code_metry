import os,sys
sys.path.append(os.getcwd())
from pascaltrianglevalue import fun_pascaltrianglevalue
import pytest


@pytest.mark.parametrize('row,col, result',[
    (1, 1, 1), (3, 5, 0),
    (3, 1, 3), (5, 2, 10),
    (6,3,20), (6,2,15),
    (7, 4, 35), (7, 9, 0)
])
def test_fun_pascaltrianglevalue(row, col, result):
    assert fun_pascaltrianglevalue(row, col) == result

