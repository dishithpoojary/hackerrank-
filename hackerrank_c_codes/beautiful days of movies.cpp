#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

	int i,j,k;
    int count=0;
	scanf("%d %d %d",&i,&j,&k);
    
	while(i<=j)
	{
	
		int icopy=i;
	    int ri=0;
		    
			while(i!=0)
		    {
		    	ri=ri*10+i%10;
		    	i=i/10;
			}
		   
		   if((icopy-ri)%k==0)
		   {
		   count++; 
		   }	   
	   // printf("%d",ri);
	    i=icopy;
	    i++;
	}
	
	printf("%d",count);
    return 0;
}

