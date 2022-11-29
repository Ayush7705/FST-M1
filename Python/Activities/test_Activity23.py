import pytest

@pytest.fixture
def numList():
    list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    return list

def test_sum(numList):
    sum = 0
    for num in numList:
        sum += num
    assert sum==55
