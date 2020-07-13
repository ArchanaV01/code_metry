import os,sys
sys.path.append(os.getcwd())
from pythondictionaries import *
import pytest

location = ['Atlanta', 'Mountain View']
@pytest.mark.parametrize('result,check',[
    (location,sortUSA())
])
def test_classiness_1(result, check):
    assert result == check


location = ['Bangalore - India', 'Shanghai - China']
@pytest.mark.parametrize('result,check',[
    (location,alphaAsia())
])
def test_classiness_2(result, check):
    assert result == check
