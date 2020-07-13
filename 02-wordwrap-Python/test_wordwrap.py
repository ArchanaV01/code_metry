import os,sys
sys.path.append(os.getcwd())
from wordwrap import fun_wordwrap
import pytest


@pytest.mark.parametrize('s1, s2, result',[	
(" a b c de fgh ",  4, "a-b-\nc-de\n-fgh"),
 ("  abcdefghij", 4, "abcd\nefgh\nij")
])
def test_fun_wordwrap(s1, s2, result):
    assert fun_wordwrap(s1, s2) == result

