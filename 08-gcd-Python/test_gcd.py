import os,sys
sys.path.append(os.getcwd())
from gcd import gcd
import pytest


@pytest.mark.parametrize('m, n, result',[
	(2, 3, 1), (1000, 12345, 5),
	(1000000, 999995, 5), (1000000,999994, 2),
	(88886, 474747, 7), (151, 139, 1),
	(49, 77777, 7), (14456, 143, 13),
	(155667, 54321, 57), (24323, 53245, 1),
	(0, 1, 1), (1, 0, 1)
])
def test_gcd(m, n, result):
    assert gcd(m, n) == result
