args = int(input())


def factorial(num):
    fact = num
    for i in range(num-1,1,-1):
        fact = fact * i
    return fact

for i in range(args):
    num = int(input())
    fact = factorial(num)
    print(fact)
