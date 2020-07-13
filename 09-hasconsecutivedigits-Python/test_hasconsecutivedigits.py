import os,sys
sys.path.append(os.getcwd())
from hasconsecutivedigits import hasconsecutivedigits
import pytest


@pytest.mark.parametrize('n, result',[
	(-24, False),
	(0, False),
	(26011, True),
	(14, False),
	(2, False),
	(5, False),
	(5231123123123, True),
	(-5231123123123, True),
	(-11023, True),
])
def test_hasconsecutivedigits(n, result):
    assert hasconsecutivedigits(n) == result
