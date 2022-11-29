import pandas as pd

data = {
    "Username":  ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}

dataframe = pd.DataFrame(data)
print(dataframe)

dataframe.to_csv("data.csv", index=False)