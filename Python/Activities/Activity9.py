# Given lists
listone = [35, 12, 41, 32, 13]
listTwo = [11, 24, 32, 38, 29]
 
# Print the lists
print("First List ", listone)
print("Second List ", listTwo)
 
# Declare a third list that will contain the result
thirdList = []
 
# Iterate through first list to get odd elements
for num in listone:
    if (num % 2 != 0):
        thirdList.append(num)
        
# Iterate through first list to get even elements
for num in listTwo:
    if (num % 2 == 0):
        thirdList.append(num)
 
# Print result
print("result List is:")
print(thirdList)