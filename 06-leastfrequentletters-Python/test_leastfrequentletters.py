import os,sys
sys.path.append(os.getcwd())
from leastfrequentletters import leastfrequentletters
import pytest


@pytest.mark.parametrize('x, result',[
	("aDq efQ? FB'daf!!!", "be"), 
	("?'!!", ""), 
	("abc def! GFE'cag!!!", "bd"), 
	("abc def! GFE'cag!!!".lower(), "bd"), 
	("abc def! GFE'cag!!!".upper(), "bd"),
	("", "")
])

def test_leastfrequentletters(x, result):
    assert leastfrequentletters(x) == result
