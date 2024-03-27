import math

str = "aBcDeFg"
str2 = ""

for i in str :
    if i.isupper() :
       str2 += i.lower()
    else:
        str2 += i.upper()

print(str2)