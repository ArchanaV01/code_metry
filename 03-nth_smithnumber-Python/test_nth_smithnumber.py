import os,sys
sys.path.append(os.getcwd())
from nth_smithnumber import fun_nth_smithnumber
import pytest


@pytest.mark.parametrize('x, result',[
    (0, 4), 
    (1, 22), 
    (2, 27), 
    (5, 94), 
    (10, 274),
    (15, 382), 
    (17, 438), 
    (19, 483)
    
])

def test_fun_nth_smithnumber(x, result):
    assert fun_nth_smithnumber(x) == result

    