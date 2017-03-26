#include<stdio.h>
#include<stdlib.h>
#include<math.h>


int main()
{
	int i,j;
	int n,m;
	char grid[15][15];
	
	scanf("%d %d",&n,&m);
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			scanf(" %c",&grid[i][j]);
		}
	}
	
	
	
	
	
/*	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			printf("%c",grid[i][j]);
		}
		printf("\n");
	}
*/

		
	
	
	
	return 0;
}
