import math

numer1 = 9
denom1 = 2
numer2 = 1
denom2 = 3

def solution(numer1, denom1, numer2, denom2):
    numer = denom1 * numer2 + denom2 * numer1
    denom = denom1 * denom2
    gcd = math.gcd(denom, numer)
    return [numer//gcd, denom//gcd]

# solution 메소드 실행
print(solution(numer1, denom1, numer2, denom2))