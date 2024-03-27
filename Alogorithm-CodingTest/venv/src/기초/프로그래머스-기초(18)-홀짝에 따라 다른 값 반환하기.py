n = 7
answer = 0

# 1) 내가 푼 방법 - for문과 조건문 활용하기
for i in range(n+1) :

    if n % 2 == 1 :
        if i % 2 == 1 :
            answer += i
    else :
        if i % 2 == 0:
            answer += i * i

print(answer)


# 2) 다른 사람이 푼 방법 - sum()과 range() 활용하기
if n % 2 == 1 :
    print(sum(range(1, n+1, 2)))
else :
    print(sum([i*i for i in range(2, n+1, 2)]))
