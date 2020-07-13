import os,sys
sys.path.append(os.getcwd())
from binarytree import BinaryTree, Node
import pytest

tree = BinaryTree(1)
@pytest.mark.parametrize('check,result',[
    (tree.search(4), False), (tree.search(6), False)
])
def test_classiness1(check, result):
    assert check == result

tree.root.left = Node(2)
tree.root.right = Node(3)
tree.root.left.left = Node(4)
tree.root.left.right = Node(5)

@pytest.mark.parametrize('check,result',[
    (tree.search(4), True), (tree.search(6), False),
])
def test_classiness2(check, result):
    assert check == result

@pytest.mark.parametrize('check,result',[
    (tree.search(None), False), (tree.search("6"), False),
])
def test_classiness2(check, result):
    assert check == result
