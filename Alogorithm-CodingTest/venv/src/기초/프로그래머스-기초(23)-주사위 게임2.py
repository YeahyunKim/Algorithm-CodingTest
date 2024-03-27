a = 2
b = 6
c = 1

# 내가 푼 방법 : set()과 len(), 조건문
def solution(a, b, c) :
    dice_number_count = len(set([a, b, c]))

    if dice_number_count == 3 :
        return a + b + c
    elif dice_number_count == 2 :
        return (a + b + c) * (a**2 + b**2 + c**2)

    else :
        return (a + b + c) * (a**2 + b**2 + c**2) * (a**3 + b**3 + c**3)

print(solution(a, b, c))