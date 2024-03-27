code = 'abc1abc1abc'
ret = ''
mode = 0


# 1) 내가 푼 방법 - for문과 조건문
for i in range(len(code)) :
    if mode == 0 :
        if code[i] != '1' :
            if i % 2 == 0 :
                ret += code[i]
        else :
            mode = 1

    else :
        if code[i] != '1' :
            if i % 2 == 1 :
                ret += code[i]
        else :
            mode = 0


print('EMPTY' if ret == '' else ret)
