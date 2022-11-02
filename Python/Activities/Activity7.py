#Get the user Input
lst = []
n = int(input("Enter number of elements :"))
for i in range(0,n):
  ele = int(input())
  lst.append(ele)
print(lst)

sum = 0
 
for n in lst:
  sum += int(n)
 
print(sum)