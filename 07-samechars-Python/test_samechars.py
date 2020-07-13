import os,sys
sys.path.append(os.getcwd())
from samechars import samechars
import pytest


@pytest.mark.parametrize('x, result',[
	(("abcabcabc", "cba") , True),
	(("abcabcabc", "cbad") , False),
	(("abcabcabc", "cBa") , False),
	((42,"The other parameter is not a string") , False),
	(("","") , True),
])

def test_samechars(x, result):
    assert samechars(x) == result
