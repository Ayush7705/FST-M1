from unittest import result


def sum(numbers):
    sum = 0
    for num in numbers:
        sum = num + sum
    return sum

numlist = list((1,2,3,4,5,6))
result = sum(numlist)
print("Sum is " +str(result))
