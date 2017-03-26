#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int h[26];
    int max =0;
    
	for(int h_i = 0; h_i < 26; h_i++)
	{
       scanf("%d",&h[h_i]);
    }
    char word [10];
    scanf("%s",word);

   	for(int i=0;i<strlen(word);i++)
   	{
   		//printf("%d\n",h[(int)word[i]-97]);
   		if(h[(int)word[i]-97]>max)
		  max = h[(int)word[i]-97];		
		   	
	}
        
         printf("%d",max*strlen(word));
    return 0;
}
