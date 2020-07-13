import os,sys
sys.path.append(os.getcwd())
from nthpowerfulnumber import nthpowerfulnumber
import pytest


@pytest.mark.parametrize('x, result',[
	(53, 1000), 
	(39, 576), 
	(29, 343), 
	(17, 128), 
	(18, 144), 
	(19, 169), 
	(4, 16), 
	(5, 25), 
	(6, 27), 
	(7, 32), 
	(8, 36), 
	(9, 49), 
	(10, 64), 
	(0, 1)
])

def test_nthpowerfulnumber(x, result):
	assert nthpowerfulnumber(x) == result
