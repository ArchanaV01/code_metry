import os,sys
sys.path.append(os.getcwd())
from applycaesarcipher import fun_applycaesarcipher
import pytest


@pytest.mark.parametrize('msg, shift, result',[
    ("We Attack At Dawn", 1, "Xf Buubdl Bu Ebxo"), ("zodiac", -2, "xmbgya"),
("ABCDXYZ", -3,"XYZAUVW"),("ABCDXYZ", 3,"DEFGABC"), ("abcdxyz", -3,"xyzauvw"),
("abcdxyz", 3,"defgabc")
])
def test_fun_applycaesarcipher(msg, shift, result):
    assert fun_applycaesarcipher(msg, shift) == result

