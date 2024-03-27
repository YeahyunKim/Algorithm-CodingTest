number = 98
n = 2
m = 5

# 1) 내가 푼 방법 - 삼항 연산자 / 논리연산자
print(1 if number % n == 0 and number % m == 0 else 0)

# 2) 내가 푼 방법 - bool->int 형변환 / 논리연산자
print(int(number % n == 0 and number % m == 0))