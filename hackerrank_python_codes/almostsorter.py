n = int(input())
temp = input()
arr = temp.split(" ")
arr = arr[0:n]
arrc = arr[:]
arrc.sort()
swap = 0
ind=[0,0]

for i in range(0,n):
    if arr[i]!=arrc[i]:
        if swap<2:
            ind[swap]=i+1
        swap+=1

##print(arr)
##print("yes\nswap ",ind[0]," ",ind[1])
##print(arrc)


if swap==0:
    print("yes")
elif swap==2:
    print("yes\nswap",ind[0],ind[1])
else:
    i=0
    j=n-1
    while arr[i]==arrc[i]:
        i+=1
##    print(i)
    ind[0] = i+1
    while arr[j]==arrc[j]:
        j-=1
##    print(j)
    ind[1] = j+1


    while arr[i]==arrc[j]:
        i+=1
        j-=1
    i-=1
    j+=1
    
##    print(i,j)
    if i==ind[1]-1 and j==ind[0]-1:
        print("yes\nreverse",ind[0],ind[1])
    else:
        print("no")
            
    



