str1 = "apple pen"
str2 = "Hello World!"

# 1) 내가 푼 방법 - replace() 활용하기
print(str1.replace(" ", "") + str2.replace(" ", ""))

# 2) 내가 푼 방법 - 더 줄여보기
print(input().strip().replace(' ', ''))