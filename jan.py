inp = int(input())
for i in range(inp):
    counter = 0
    numoftowers = int(input())
    towers = list(input())
    zcounter = False
    for j in range(len(towers)):
        
        if zcounter:
            if towers[j] == "0":
                
                if j != len(towers)-1 :
                    if magchanum == "1" and towers[j+1] == "1":
                        continue
                    else:
                        counter = counter + 1
                        if magchanum == "1":
                            towers[j] = "1"
                        else:
                            towers[j-1] = "1"
                        zcounter = False 
                else:
                    pudhchanum = "0"
                    
                    if magchanum == "1" and pudhchanum == "1":
                        continue
                    else:
                        
                        counter = counter + 1
                        if magchanum == "1":
                            towers[j] = "1"
                        else:
                            towers[j-1] = "1"
                        zcounter = False
            else:
                zcounter = False

        elif towers[j] == "0":
            
            zcounter = True
            if j == 0:
                magchanum = "0"
            else:
                magchanum = towers[j-1]
        
        elif towers[j] == "1":
            if j==0:
                magchanum = "0"
            else:
                magchanum = towers[j-1]
     
    print(counter)
