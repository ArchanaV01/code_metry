import os,sys
sys.path.append(os.getcwd())
from ishappynumber import ishappynumber
import pytest


@pytest.mark.parametrize('m, result',[
	(-7, False), (1, True),
	(2, False), (98, False),
	(405, False), (97, True),
	(404, True), (0, False)
])
def test_ishappynumber(m, result):
    assert ishappynumber(m) == result
