import pytest

def test_addition():
    num1 = 10
    num2 = 20
    sum = num1 + num2
    assert sum == 30

def test_subtraction():
    num1 = 15
    num2 = 10
    diff = num1 - num2
    assert diff == 5

@pytest.mark.activity
def test_multiply():
    num1 = 10
    num2 = 12
    product = num1 * num2
    assert product == 130

@pytest.mark.activity
def test_quotient():
    num1 = 100
    num2 = 20
    quotient = num1 / num2
    assert quotient == 5


    