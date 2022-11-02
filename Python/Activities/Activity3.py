# Get the users names
user1 = input("Enter Player 1's name? ")
user2 = input("Enter Player 2's name? ")
 
# Get the users choices
user1_Input = input(user1 + ", What do you want to choose rock, paper or scissors? ")
user2_Input = input(user2 + ", What do you want to choose rock, paper or scissors? ")
 
# Run the algorithm to see who wins
if user1_Input == user2_Input:
    print("It's a tie!")
elif user1_Input == 'rock':
    if user2_Input == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif user1_Input == 'scissors':
    if user2_Input == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif user1_Input == 'paper':
    if user2_Input == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")
