# Given list of numbers
#numList = [10, 20, 30, 40, 10]
#print("Given list is ", numList)
lst = []
n = int(input("Enter number of elements :"))
for i in range(0,n):
  ele = int(input())
  lst.append(ele)
print(lst)
 
# Get first element in list
firstElement = lst[0]
# Get last element in list
lastElement = lst[-1]
 
# Check if first and last element are equal
if (firstElement == lastElement):
    print(True)
else:
    print(False)