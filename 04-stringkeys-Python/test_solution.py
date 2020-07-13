import os,sys
sys.path.append(os.getcwd())
from stringkeys import HashTable
import pytest

hash_table = HashTable()
@pytest.mark.parametrize('check,result',[
    (hash_table.calculate_hash_value('UDACITY'),8568),
    (hash_table.lookup('UDACITY'),-1)
])
def test_classiness(check, result):
    assert check == result


hash_table.store('UDACITY')
@pytest.mark.parametrize('check,result',[
    (hash_table.lookup('UDACITY'),8568)
])
def test_classiness1(check, result):
    assert check == result

@pytest.mark.parametrize('check,result',[
    (hash_table.calculate_hash_value('UDACIOUS'),8568),
    (hash_table.lookup('UDACIOUS'),-1)
])
def test_classiness3(check, result):
    assert check == result


hash_table.store('UDACIOUS')
@pytest.mark.parametrize('check,result',[
    (hash_table.lookup('UDACIOUS'),8568)
])
def test_classiness4(check, result):
    assert check == result
