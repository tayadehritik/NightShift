from math import factorial
args = int(input())

def tail(n):
    count = 0
  
    # Keep dividing n by 
    # powers of 5 and 
    # update Count 
    i=5
    while (n/i>=1): 
        count += int(n/i) 
        i *= 5
  
    return int(count) 


for i in range(args):
    num = int(input())
    fact = tail(num)
    print(fact)
    

