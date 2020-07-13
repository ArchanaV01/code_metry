import os,sys
sys.path.append(os.getcwd())
from longestcommonsubstring import longestcommonsubstring
import pytest


@pytest.mark.parametrize('x, y, result',[
	("abcdef", "abqrcdest", "cde"), 
	("abcdef", "ghi", ""), 
	("abABC", "abcAB", "AB"), 
	("abcdef", "abqrcdest",  "cde"),
	("abcdef", "ghi",  ""),
	("", "abqrcdest",  ""),
	("abcdef", "",  ""),
	("abcABC", "zzabZZAB",  "AB"),
])

def test_longestcommonsubstring(x, y, result):
    assert longestcommonsubstring(x, y) == result
