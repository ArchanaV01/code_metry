import os,sys
sys.path.append(os.getcwd())
from nthautomorphicnumber import nthautomorphicnumbers
import pytest


@pytest.mark.parametrize('x, result',[
(1, 0), 
(2, 1), 
(3, 5), 
(4, 6), 
(5, 25), 
(6, 76), 
(7, 376), 
(8, 625), 
(9, 9376), 
(10, 90625), 
(11, 109376), 
(12, 890625), 
(13, 2890625), 
(14, 7109376), 
(15, 12890625), 
(16, 87109376), 
(17, 212890625), 
(18, 787109376), 
(19, 1787109376), 
(20, 8212890625), 
(21, 18212890625), 
(22, 81787109376), 
(23, 918212890625), 
(24, 9918212890625), 
(25, 40081787109376), 
(26, 59918212890625), 
(27, 259918212890625), 
(28, 740081787109376), 
])

def test_nthautomorphicnumbers(x, result):
    assert nthautomorphicnumbers(x) == result
