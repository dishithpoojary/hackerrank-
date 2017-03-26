#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n; 
    int k; 
    int i;
    int j;
    int m=0;
    scanf("%d %d",&n,&k);
    char* number = (char *)malloc(10240 * sizeof(char));
    scanf("%s",number);
 	i=0;
 	j=n-1;
 	
	while(i<j)
 	{
 		
 		if(number[i]!=number[j])
 		{
 		
			 if(number[i]>number[j])
				number[j]=number[i];
			 else
			 	number[i]=number[j]	;	 
		k--; 	
		}
		
		i++;
		j--;
	}

//	printf("%s",number);
    printf("%d\n",k);
  
  if(k<0)
  printf("-1");
  else{
  
	while(k>1)
	{
	    
	    
		
			number[m]=number[n-1-m]='9';
			m++;
			k=k-2;
		
	}
	
		if(k==1 && n%2!=0)
		{
			number[(n)/2]='9';
		//	printf("%d\n",k);
			k--;
		}
	printf("%d\n",k);
	printf("%s",number);
}
    return 0;
}

