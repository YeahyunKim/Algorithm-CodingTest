ineq = "<"
eq = "="
n = 20
m = 30


# 1) 내가 푼 방법 - 조건문 활용하기
if eq != "!" :
    if ineq == ">":
        print(int(n >= m))
    else :
        print(int(n <= m))
else :
    if ineq == ">":
        print(int(n > m))
    else :
        print(int(n < m))


# 2) 다른 사람이 푼 방법 - f-string 과 eval() 활용하기
print(int(eval(f"{n}{ineq}{eq}{m}".replace("!", ""))))