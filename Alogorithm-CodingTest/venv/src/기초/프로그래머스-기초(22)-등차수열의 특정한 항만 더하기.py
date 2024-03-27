included = [True, False, False, True, True]
a = 3
d = 4
answer = 0

# 1) 내가 푼 방법 - for문과 형변환
for i in range(len(included)) :
    answer += (a + d * i) * int(included[i])

print(answer)