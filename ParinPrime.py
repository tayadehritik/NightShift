
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


      


def primes(n):
    """ Returns  a list of primes < n """
    sieve = [True] * n
    for i in range(3,int(n**0.5)+1,2):
        if sieve[i]:
            sieve[i*i::2*i]=[False]*(int((n-i*i-1)/(2*i)+1))
    return [2] + [i for i in range(3,n,2) if sieve[i]]


newprimelist = primes(greatest)


for i in arr:
    start = i[0]
    end = i[1]
    sum = 0
    for j in newprimelist:
        k = j
        #for k in range(j, end+1, j):
        #    print(j,k,sum, end)
        #    sum += j
        while k<=end:
            #print(sum)
            if k>=start:
                sum += j
                k += j
            else:
                k += j

           
    print(sum%1000000007)
    