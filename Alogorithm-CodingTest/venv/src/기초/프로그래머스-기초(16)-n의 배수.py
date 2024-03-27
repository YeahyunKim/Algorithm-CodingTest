num = 98
n = 2

# 1) 내가 푼 방법 - 삼항 연산자 활용하기
print(1 if num % n == 0 else 0)

# 2) 내가 푼 방법 - bool->int 형변환
print(int(num % n == 0))