import pytest
from handtodice import handtodice
import os
import sys
sys.path.append(os.getcwd())


@pytest.mark.parametrize('a, check', [
    (123, (1, 2, 3)),
    (214, (2, 1, 4)),
    (422, (4, 2, 2)),
    (400, (4, 0, 0)),
    (101, (1, 0, 1))
])
def test_handtodice(a, check):
    assert handtodice(a) == check
