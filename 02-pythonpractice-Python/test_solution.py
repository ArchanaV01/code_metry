import os,sys
sys.path.append(os.getcwd())
from pythonpractice import Classy
import pytest

me = Classy()
result = me.classiness()

@pytest.mark.parametrize('result,check',[
    (result,0)
])
def test_classiness_1(result, check):
    assert result == check


me = Classy()
result = me.classiness()
me.addItem("tophat")
result = me.classiness()
me.addItem("bowtie")
me.addItem("jacket")
me.addItem("monocle")
result = me.classiness()
me.addItem("bowtie")
result = me.classiness()

@pytest.mark.parametrize('result,check',[
    (result,15)
])
def test_classiness_2(result, check):
    assert result == check

me = Classy()
me.addItem("tophat")
result = me.classiness()

@pytest.mark.parametrize('result,check',[
    (result,2)
])
def test_classiness_3(result, check):
    assert result == check


me = Classy()
me.addItem("tophat")
me.addItem("bowtie")
me.addItem("jacket")
me.addItem("monocle")
result = me.classiness()
@pytest.mark.parametrize('result,check',[
    (result,11)
])
def test_classiness_4(result, check):
    assert result == check