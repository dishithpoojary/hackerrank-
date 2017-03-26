import math
t = int(input().strip())

for i in range(0,t):
    

    str = input()
    nums = str.split()
    n1 = int(nums[0])
    n2 = int(nums[1])
    
    if(math.sqrt(n1)==int(math.sqrt(n1))):
        print( int(math.sqrt(n2))+1 - int(math.sqrt(n1)))
    else:
        print( int(math.sqrt(n2))+1 -int(math.sqrt(n1))-1)    
   
