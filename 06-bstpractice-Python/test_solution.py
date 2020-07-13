import os,sys
sys.path.append(os.getcwd())
from bst import BST, Node
import pytest

tree = BST(4)

@pytest.mark.parametrize('check,result',[
    (tree.search(4), True), (tree.search(6), False)
])
def test_classiness1(check, result):
    assert check == result

tree.insert(2)
tree.insert(1)
tree.insert(3)
tree.insert(5)
@pytest.mark.parametrize('check,result',[
    (tree.search(5), True), (tree.search(6), False),
])
def test_classiness2(check, result):
    assert check == result

@pytest.mark.parametrize('check,result',[
    (tree.search(None), False), (tree.search("6"), False),
])
def test_classiness3(check, result):
    assert check == result
