import os,sys
sys.path.append(os.getcwd())
from rotatestrings import fun_rotatestrings
import pytest


@pytest.mark.parametrize('s1, s2, result',[	
("abcd", -1, "dabc"), ("abcd", 1,"bcda"),("abcd", -6,"cdab"),
("abcd", 3, "dabc"), ("ac323", 8, "23ac3"),("ac232", 0, "ac232")
])
def test_fun_rotatestrings(s1, s2, result):
    assert fun_rotatestrings(s1, s2) == result

