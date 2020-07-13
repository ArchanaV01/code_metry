import os,sys
sys.path.append(os.getcwd())
from fabricyards import fun_fabricyards, fun_fabricexcess
import pytest


@pytest.mark.parametrize('a, result',[
    (0,0),(1,1),(35,1),(36,1),(37,2),(38,2),(72,2),(73,3)
])
def test_fun_fabricyards(a, result):
    assert fun_fabricyards(a) == result

@pytest.mark.parametrize('a, result',[
    (0,0),(1,35),(35,1),(36,0),(37,35),(38,34),(72,0),(73,35)
])
def test_fun_fabricexcess(a, result):
    assert fun_fabricexcess(a) == result

