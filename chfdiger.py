args = int(input())

def appendandremove(N, index):
    newnum = list(N)
    for i in range(index, len(newnum)-1):
            newnum[i] = newnum[i+1]
    ret =  "".join(newnum[0:len(newnum)-1])
    return int(ret)

def append(N,d):
    N = N + d
    return N

for k in range(args):
    inp = input().split(' ')
    N = inp[0]
    d = inp[1]
    small = int(N)
    flag = False
    while(flag == False):
        appendednum = append(str(small),d)
        for i in range(len(appendednum)):
            ret = appendandremove(appendednum, i)
            
            if(ret < small):
                small = ret
            
        if(ret == small):
            flag = True

    print(small)
    
    
