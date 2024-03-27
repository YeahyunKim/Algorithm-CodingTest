str = "aBcDeFg"

# 1) 내가 푼 방법 - for문과 조건문
result = ""

for i in str :
    if i.isupper() :
        result += i.lower()
    else:
        result += i.upper()

print(result)


# 2) 다른 사람들의 풀이 - swapcase()
str = input()

print(str.swapcase())