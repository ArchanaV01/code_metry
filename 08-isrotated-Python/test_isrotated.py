
import os,sys
sys.path.append(os.getcwd())
from isrotated import isrotated
import pytest


@pytest.mark.parametrize("a, b, result",[
	("XYZ", "ZXY", True),
	("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "BCDEFGHIJKLMNOPQRSTUVWXYZA", True),
	("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "JKLMNOPQRSTUVWXYZABCDEFGHI", True),
	("12345", "54321", True),
	("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ACDEFGHIJKLMNOPQRSTUVWXYZB", False),
	("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "BCDEFGHIJKLMNOPQRSTUVWXYZZ", False),
	("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ABCDEFGHIJKLMNPQRSTUVWXYZ", False),
	("ABCDEFGHIJKLMNOPQRSUVWXYZ", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", False)
])
def test_isrotated(a, b, result):    
    assert isrotated(a, b) == result
