t = int(input())

for _ in range(t):

    n,k,b = input().split()
    
    n = int(n) 
    k = int(k)
    b = int(b)

    sum_ = (b/2)*(b+1)
    stri = ""
    dif  = n-sum_
    h = k-b

    quo = 0
    rem = 0
    if h is not 0:
        quo  = int(dif/h)
        rem  = dif%h


    if sum_>n or (h==0 and (n!=sum_)):
        print("-1")
    elif n>b*h+sum_:
        print("-1")
    
    
    else:
        
        for i in range(b,0,-1):
            if quo is not 0:
                stri = str(int(i+h))+" " + stri 
                quo-=1
            elif quo == 0 and rem is not 0:
                stri =  str(int(i+rem))+" "+stri
                rem = 0
            elif quo == 0  and rem == 0:
                stri = str(i)+" " + stri
        stri = stri.strip()
        print(stri)                

        
