import os,sys
sys.path.append(os.getcwd())
from kth_occurrences import fun_kth_occurrences
import pytest


@pytest.mark.parametrize('s1, s2, result',[	

("helllo woorld", 2, 'o'), ("hsdibdouvbeiovbfeibvdsioubidsbvviefadbcildfab", 4, 'v'),
("    h  ", 2, 'h'), ("hello hyderabad a", 1, 'a'), ("england", 1, 'n'),
("asuszenphonemaxm1 aemnsh", 6, 'h')

])
def test_fun_kth_occurrences(s1, s2, result):
    assert fun_kth_occurrences(s1, s2) == result

