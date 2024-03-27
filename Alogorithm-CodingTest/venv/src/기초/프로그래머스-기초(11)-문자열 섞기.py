str1 = "aaaaa"
str2 = "bbbbb"

# 1) 내가 푼 방법 - for문 활용하기
result = ""

for i in range(len(str1)):
    result += str1[i] + str2[i]
print(result)


# 1) 다른사람이 푼 방법 - for문, zip()활용하기s
for s1, s2 in zip(str1, str2):
    result += s1 + s2
print(result)

