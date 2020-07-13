import os,sys
sys.path.append(os.getcwd())
from sumofsquaresofdigit import sumofsquaresofdigit
import pytest


@pytest.mark.parametrize('x, result',[
	(5, 25), 
	(12, 5), 
	(234, 29), 
	(234101, 31), 
	(2340, 29), 
	(10, 1), 
	(12012, 10), 
	(1, 1), 
	(0, 0), 
])

def test_sumofsquaresofdigit(x, result):
	assert sumofsquaresofdigit(x) == result
