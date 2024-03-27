import math

ineq = ">"
eq = "="
n = 1
m = 3

print(bool(int(f"{n}{ineq}{m}")))

# func solution(_ numbers:[Int]) -> String {
#     var strings = numbers.map{String($0)}
    # strings.sort{ $0+$1 > $1+$0 }
#
# let answer = strings.joined()
# if let num = Int(answer) { return String(num) }
# return answer
# }