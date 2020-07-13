import os,sys
sys.path.append(os.getcwd())
from digitcount import digitcount
import pytest


@pytest.mark.parametrize('n, result',[
	(-24, 2),
	(0, 1),
	(26, 2),
	(14, 2),
	(2, 1),
	(5, 1),
	(5231123123123, 13),
	(-5231123123123, 13),
])
def test_digitcount(n, result):
    assert digitcount(n) == result
