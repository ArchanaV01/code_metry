
import os,sys
sys.path.append(os.getcwd())
from recursion_binarysearchvalues import recursion_binarysearchvalues
import pytest


L = ['a', 'c', 'f', 'g', 'm', 'q']
@pytest.mark.parametrize("value, result",[
	('a', [(2,'f'), (0,'a')]),
	('c', [(2,'f'), (0,'a'), (1,'c')]),
	('f', [(2,'f')]),
	('g', [(2,'f'), (4, 'm'), (3, 'g')]),
	('m', [(2,'f'), (4, 'm')]),
	('q', [(2,'f'), (4, 'm'), (5, 'q')]),
	('z', [(2,'f'), (4, 'm'), (5, 'q')]),
	('b', [(2,'f'), (0,'a'), (1,'c')])
])
def test_recursion_binarysearchvalues(value, result):
	assert recursion_binarysearchvalues(L, value) == result
