n = 10**6

nargs = int(input())

arr = []

for _ in range(nargs):
    arr2 = list(map(int,input().split(' ')))
    arr.append(arr2)
smallest = 0
smallest = arr[0][0]
greatest = 0
greatest = arr[0][0]

for i in arr:
    for j in i:
        if(j<smallest):
            smmalest = j
        
        if(j>greatest):
            greatest = j


ogsmall = smallest
oggreat = greatest
primelist = [0 for i in range(n)]
while(greatest!=smallest):
    flag = 0
    for i in range(2, smallest-1, +1):
        if(smallest%i == 0):
            flag = 1
            break
    if(flag ==0):
        primelist[smallest] = smallest
    smallest= smallest +1
start = 0
end = 0


for i in arr:
    
    
    start = i[0]
    end = i[1]
    sum = 0
    for j in range(start,end+1):
        
        for k in range(j, start-1, -1):
           if(primelist[k] != 0):
               if(j % k == 0):
                   sum = sum + k
                   
    print(sum)
         

