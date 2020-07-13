import os,sys
sys.path.append(os.getcwd())
from isfactorish import fun_isfactorish
import pytest


@pytest.mark.parametrize('s1, result',[
	
(412, True),(-412, True),(4128, False),(112, False),(420, False),(42, False),(315, True)

])
def test_fun_isfactorish(s1, result):
    assert fun_isfactorish(s1) == result

