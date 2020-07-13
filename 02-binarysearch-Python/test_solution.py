
import os,sys
sys.path.append(os.getcwd())
from binarysearch import binary_search
import pytest


test_list = [1,3,9,11,15,19,29]


@pytest.mark.parametrize("input_array, value, result",[(test_list, 25, -1), (test_list, 15, 4)])
def test_binary_search(input_array, value, result):    
    assert binary_search(input_array,value) == result

