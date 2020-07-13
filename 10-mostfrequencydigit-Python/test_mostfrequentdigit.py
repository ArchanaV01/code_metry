import os,sys
sys.path.append(os.getcwd())
from mostfrequentdigit import mostfrequentdigit
import pytest


@pytest.mark.parametrize('n, result',[
	(24, 2),
	(0, 0),
	(26011, 1),
	(14, 1),
	(2, 2),
	(5, 5),
	(5231123123123, 1),
	(5312312355565, 5),
	(1102300, 0),
])
def test_mostfrequentdigit(n, result):
    assert mostfrequentdigit(n) == result
