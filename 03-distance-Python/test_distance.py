import os,sys
sys.path.append(os.getcwd())
from distance import fun_distance
import pytest


@pytest.mark.parametrize('check, result',[
    (fun_distance(0, 0, 0, -2), 2), (fun_distance(-20, 23, -15, 68), 45), 
    (fun_distance(30, 37, 79, -51), 100), (fun_distance(-69, 63, 57, 11), 136)
])
def test_fun_distance(check, result):
    assert check == result
