import math
nargs = int(input())
arr  = []    
for i in range(nargs):
    cast = list(map(int, input().split())) 
    arr.append(cast)

smallest = arr[0][0]
greatest = arr[0][0]

for i in arr:
    for j in i:
        if(j<smallest):
            smallest = j
        
        if(j>greatest):
            greatest = j

def isPrime(n) : 
    
    # Corner cases 
    if (n <= 1) : 
        return False
    if (n <= 3) : 
        return n
  
    # This is checked so that we can skip  
    # middle five numbers in below loop 
    if (n % 2 == 0 or n % 3 == 0) : 
        return False
  
    i = 5
    while(i * i <= n) : 
        if (n % i == 0 or n % (i + 2) == 0) : 
            return False
        i = i + 6
  
    return n
      

primelist = []
for i in range(0, greatest+1):
    
    primelist.append(isPrime(i))
 

for i in arr:
    start = i[0]
    end = i[1]
    newprime = []
    sum = 0
    count = True
    for j in range(start, end+1):
        
        if(primelist[j]!=False):
            
            sum += j
        else:
            nlist = [k for k in primelist[start:j] if k!=False]
            
            for k in nlist:
                if(j%k == 0):
                    sum += k
                

                       
    print(sum)
    