import pytest
from dicetoorderedhand import dicetoorderedhand
import os
import sys
sys.path.append(os.getcwd())


@pytest.mark.parametrize('a, b, c, check', [
    (1, 2, 3, 321),
    (6, 5, 4, 654),
    (1, 4, 2, 421),
    (6, 5, 6, 665),
    (2, 2, 2, 222)
])
def test_dicetoorderedhand(a, b, c, check):
    assert dicetoorderedhand(a, b, c) == check
