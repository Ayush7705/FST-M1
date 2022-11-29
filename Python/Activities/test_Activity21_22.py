import pytest
	
def test_addition():
    num1 = 1
    num2 = 3
    sum = num1+num2 
    assert sum == 4
	
def test_subtraction():
    num1 = 10
    num2 = 3
    sum = num1 - num2 
    assert sum == 7
	
@pytest.mark.activity
def test_multiplication():
    num1 = 10
    num2 = 3
    sum = num1 * num2 
    assert sum == 30
    
@pytest.mark.activity    
def test_division():
    num1 = 18
    num2 = 3
    sum = num1 / num2 
    assert sum == 6    