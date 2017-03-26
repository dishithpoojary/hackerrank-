#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int n;
	scanf("%d",&n);
	
	int m =5;
	for(int i=1;i<n;i++)
	{
		m=m/2;
		m=m*3;
	}
	
	printf("%d",m);
	
	 
    return 0;
}

