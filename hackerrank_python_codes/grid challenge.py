test = int(input())
for t in range(test):
    n = int(input())
    flag = 0
    grid=[[0]*n for _ in range(n)]
    for i in range (0,n):
        temp = input()
        grid[i] = list(temp)    
    for i in grid: i.sort()
    for i in range(n-1):
        if grid[i][n-1]>=grid[i+1][0]:
            flag = 1
            break;
    if flag == 1:
        print("NO")
    else:
        print("YES")
