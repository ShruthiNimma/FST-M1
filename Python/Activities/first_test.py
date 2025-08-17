import pytest
import math

@pytest.mark.xfail
def test_sqrt():
   num = 25
   assert math.sqrt(num) == 5

@pytest.mark.xfail
def testsquare():
   num = 7
   assert num*num == 40

@pytest.mark.xfail
def tesquality():
   assert 10 == 11