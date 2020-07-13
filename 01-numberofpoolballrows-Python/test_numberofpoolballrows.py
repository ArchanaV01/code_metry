import os,sys
sys.path.append(os.getcwd())
from numberofpoolballrows import fun_numberofpoolballrows
import pytest


@pytest.mark.parametrize('n, result',[
	(1, 1),
	(3, 2),
	(6, 3),
	(7, 4),
	(10, 4),
	(15, 5),
	(21, 6),
	(28, 7),
	(36, 8),
	(45, 9),
	(55, 10),
	(56, 11),
	(66, 11),
	(78, 12),
	(77, 12),
	(91, 13),
	(105, 14),
	(120, 15),
	(5050, 100),
	(500500, 1000),
	(4999950000, 99999)
])
def test_fun_numberofpoolballrows(n, result):
    assert fun_numberofpoolballrows(n) == result
