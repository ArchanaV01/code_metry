
import os,sys
sys.path.append(os.getcwd())
from canqueenattack import canqueenattack
import pytest


@pytest.mark.parametrize("a, b, c, d, result",[
	(4, 5, 6, 7, True), (1, 1, 3, 2, False), (1, 1, 4, 6, False),
	(1, 1, 1, 2, True), (1, 1, 5, 7, False), (2, 2, 5, 4, False),
	(1, 2, 3, 4, True), (2, 3, 4, 5, True), (3, 4, 5, 6, True)
])
def test_canqueenattack(a, b, c, d, result):
	assert canqueenattack(a, b, c, d) == result
