import re


def recursive_adder(num):
    if (num < 0):
        return 0
    else:
        return num + recursive_adder(num-1)

sum = recursive_adder(10)
print("The sum is: " +str(sum))