a = 12
b = 3

# 1) 내가 푼 방법 - max(), 형변환
print(max(int(str(a) + str(b)), int(str(b) + str(a))))


# 2) 다른 사람이 푼 방법 - f-string, max() 활용하기
print(int(max(f"{a}{b}", f"{b}{a}")))