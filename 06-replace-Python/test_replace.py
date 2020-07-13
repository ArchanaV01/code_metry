import os,sys
sys.path.append(os.getcwd())
from replace import fun_replace
import pytest


@pytest.mark.parametrize('s1, s2, s3, result',[
	("helloworld123", "hello", "345", "345world123"),
("helloworld123", "123", "345", "helloworld345"),
("helloworld123", "world", "345", "hello345123"),
("helloworld123", "34567", "345", "helloworld123"),
("hellrldowo23ufn348hf oincodnrld123", "rld", "     ", "hell     owo23ufn348hf oincodn     123")
])
def test_fun_replace(s1, s2, s3, result):
    assert fun_replace(s1, s2, s3) == result

