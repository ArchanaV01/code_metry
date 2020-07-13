import os,sys
sys.path.append(os.getcwd())
from interleave import fun_interleave
import pytest


@pytest.mark.parametrize('s1, s2, result',[
	("pto", "yhn", "python"), ("a#", "cD!f2", "ac#D!f2"),("hello", "world", "hweolrllod"),
("a#e23r3f", "cD!", "ac#De!23r3f"), ("a#sfgjfeel klsddjlf", "cD!f2sd", "ac#Ds!ffg2jsfdeel klsddjlf")

])
def test_fun_interleave(s1, s2, result):
    assert fun_interleave(s1, s2) == result

