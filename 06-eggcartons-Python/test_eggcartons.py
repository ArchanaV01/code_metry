import os,sys
sys.path.append(os.getcwd())
from eggcartons import fun_eggcartons
import pytest


@pytest.mark.parametrize('check, result',[
    (fun_eggcartons(0), 0), (fun_eggcartons(12), 1),
    (fun_eggcartons(10), 1), (fun_eggcartons(13), 2),
    (fun_eggcartons(24), 2), (fun_eggcartons(25), 3)
])
def test_fun_eggcartons(check, result):
    assert check == result
