import os,sys
sys.path.append(os.getcwd())
from bonusplaythreediceyahtzee import bonusplaythreediceyahtzee
import pytest


@pytest.mark.parametrize('n, result',[
	(2312413, (432, 4)),
	(2315413, (532, 5)),
	(2345413, (443, 18)),
	(2633413, (633, 16)),
	(2333413, (333, 29)),
	(2333555, (555, 35))
])
def test_bonusplaythreediceyahtzee(n, result):
    assert bonusplaythreediceyahtzee(n) == result
