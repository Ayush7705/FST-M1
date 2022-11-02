#num_tuple = (10, 20, 33, 46, 55)
#print("Given list is ", num_tuple)
 
#num_tuple = input("enter the tuple\n")
#print(num_tuple)
lst = []
n = int(input("Enter number of elements :"))
for i in range(0,n):
  ele = int(input())
  lst.append(ele)
print(lst)
# Print elements that are divisible by 5
print("Elements that are divisible by 5:")
for num in lst:
    if (num % 5 == 0):
        print(num)