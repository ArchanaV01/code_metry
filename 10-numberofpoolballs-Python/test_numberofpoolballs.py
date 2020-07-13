import os,sys
sys.path.append(os.getcwd())
from numberofpoolballs import numberofpoolballs
import pytest


@pytest.mark.parametrize('n, result',[
	(1, 1),
	(2, 3),
	(3, 6),
	(4, 10),
	(5, 15),
	(6, 21),
	(7, 28),
	(8, 36),
	(9, 45),
	(10, 55),
	(11, 66),
	(12, 78),
	(13, 91),
	(14, 105),
	(15, 120),
	(100, 5050),
	(1000, 500500),
	(99999, 4999950000)
])
def test_numberofpoolballs(n, result):
    assert numberofpoolballs(n) == result
