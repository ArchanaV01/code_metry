import os,sys
sys.path.append(os.getcwd())
from nth_lefttruncatableprime import fun_nth_lefttruncatableprime
import pytest


@pytest.mark.parametrize('a, result',[
   (0,2),(1, 3),(5, 17),(10,53),
(15,113),(20,223),(25,347),

])
def test_fun_nth_lefttruncatableprime(a, result):
    assert fun_nth_lefttruncatableprime(a) == result

