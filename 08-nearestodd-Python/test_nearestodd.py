import os,sys
sys.path.append(os.getcwd())
from nearestodd import fun_nearestodd
import pytest


@pytest.mark.parametrize('Number, result',[
    (12.0, 11), (14.2, 15),
    (16.5, 17), (18.6, 19),
    (25.0, 25), (27.2, 27),
    (29.5, 29), (31.6, 31)
])
def test_fun_nearestodd(Number, result):
    assert type(fun_nearestodd(Number)) == int 
    assert fun_nearestodd(Number) == result

