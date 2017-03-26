#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

  	int t;
	int c=0;
	int temp[3];
	scanf("%d",&t);
	 
	for(int i=0;i<t;i++)
	{
		int n,a[1000];
		
		scanf("%d",&n);
		c=0;
		
		for(int j=0;j<n;j++)
		{
			scanf("%d ",&a[j]);
			
			if(a[j]!=(j+1))
			{
				temp[c]=a[j];
				c++;																		
			}	
		}
		
		
	
		
	}
    return 0;
}
