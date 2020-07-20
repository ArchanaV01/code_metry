
import pytest
from isrotated import isrotated
import os
import sys
sys.path.append(os.getcwd())


@pytest.mark.parametrize("a, b, result", [
    ("XYZ", "ZXY", True),
    ("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "BCDEFGHIJKLMNOPQRSTUVWXYZA", True),
    ("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "JKLMNOPQRSTUVWXYZABCDEFGHI", True),
    ("12345", "54321", False),
    ("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ACDEFGHIJKLMNOPQRSTUVWXYZB", False),
    ("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "BCDEFGHIJKLMNOPQRSTUVWXYZZ", False),
    ("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ABCDEFGHIJKLMNPQRSTUVWXYZ", False),
    ("ABCDEFGHIJKLMNOPQRSUVWXYZ", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", False)
])
def test_isrotated(a, b, result):
    assert isrotated(a, b) == result
