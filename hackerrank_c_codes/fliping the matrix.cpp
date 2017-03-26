#include<stdio.h>
#include<stdlib.h>

int main()
{
	int i,j,t,n;
	
	int m=0;
	
	
	scanf("%d",&t);
	
	for(int i=0;i<t;i++)
	{
		
		scanf("%d",&n);
		int arr[2*n][2*n];
		int max;
			max=0;
		for(int j=0;j<2*n;j++)
		{
			for(int k=0;k<2*n;k++)
			{
				
				scanf("%d",&arr[j][k]);	
			}	
		}
		
		
		for(int j=0;j<n;j++ )
		{
		for(int k=0;k<n;k++)
		{
				
		max+= (((arr[j][k]>arr[j][2*n-1-k])?arr[j][k]:arr[j][2*n-1-k])>((arr[2*n-1-j][k]>arr[2*n-1-j][2*n-1-k])?arr[2*n-1-j][k]:arr[2*n-1-j][2*n-1-k])?((arr[j][k]>arr[j][2*n-1-k])?arr[j][k]:arr[j][2*n-1-k]):((arr[2*n-1-j][k]>arr[2*n-1-j][2*n-1-k])?arr[2*n-1-j][k]:arr[2*n-1-j][2*n-1-k]));
		}
		}
		
		printf("%d\n",max);
		
		
	}
	
	
	
	return 0;
}
