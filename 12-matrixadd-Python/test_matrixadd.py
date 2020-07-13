
import os,sys
sys.path.append(os.getcwd())
from matrixadd import matrixadd
import pytest


@pytest.mark.parametrize("L, M, N",[
	([[1,  2,  3],[4,  5,  6]], [[21, 22, 23], [24, 25, 26]], [[23, 24, 26],[28, 30, 32]]),
	([[1,  2,  3],[4,  5,  6], [7, 8, 9]], [[1,  2,  3],[4,  5,  6], [7, 8, 9]], [[2, 4, 6],[8, 10, 12], [14, 16, 18]]),
	([[1,  2,  3],[4,  5,  6]], [[21, 22, 23], [24, 25]], None),
	([[1]], [[10]], [[11]]),
	([[1, 2]], [[10]], None),

])
def test_matrixadd(L, M, N):
    assert matrixadd(L, M) == N
