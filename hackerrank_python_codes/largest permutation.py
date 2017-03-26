nk = list(map(int,input().strip().split(" ")))
arr = list(map(int,input().strip().split(" ")))

first =""

for i in range(0,nk[1]):
    if i > nk[0]:
        break;
    if arr[i]!=nk[0]-i:
        maxindex = arr.index(max(arr))
        arr[maxindex],arr[0]=arr[0],arr[maxindex]      
    first = first + str(arr[0]) + " "
    arr.pop(0)

for element in arr:
    first = first + str(element)+" "

print(first.strip())

