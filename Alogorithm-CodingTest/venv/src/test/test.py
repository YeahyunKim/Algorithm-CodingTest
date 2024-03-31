name = ["may", "kein", "kain", "radi"]

t = "3141592"
p = "127"
answer = 0

for i in range((len(t) - len(p) + 1)) :
    if int(t[i:len(p)+i]) <= int(p) :
        answer += 1

