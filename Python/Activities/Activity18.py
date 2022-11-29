import pandas 
df = pandas.read_csv('data.csv')
print(df)

print("Username: ")
print(df["Username"])

print("Username and Password of the second row: ")
print("Username: ", df["Username"][1], " | Passwords: ", df["Passwords"][1])

print("Usernames column data in ascending order: ")
print(df.sort_values("Username"))

print("Passwords column in descending order: ")
print(df.sort_values("Passwords", ascending=False))