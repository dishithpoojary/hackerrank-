n = int(input().strip())

arr = list(map(int,input().strip().split(" ")))

count =0

for i in range(0,len(arr)):
    com = arr[i]
    flag = 0
     
    for j in range(i+1,len(arr)):

        if j<len(arr)-1:
            if arr[j]>com:
                flag = 1
            if flag==0 and com == arr[j]:
                count+=1
##                for item in range(arr.count(com)):
##                    arr.remove(com)
        print(arr)



print(count*2)
