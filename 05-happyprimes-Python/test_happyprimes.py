import os,sys
sys.path.append(os.getcwd())
from happyprimes import ishappyprimenumber
import pytest


@pytest.mark.parametrize('x, result',[
	(2, False), (23, True),
	(1008, False), (31, True),
	(940, False), (19, True),
	(1000, False), (331, True),
	(1418854, False), (709, True),
	(6, False), (833, True)
])

def test_ishappyprimenumber(x, result):
	assert ishappyprimenumber(x) == result
