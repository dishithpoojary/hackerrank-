package hackerrank;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Cutthesticks {

    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	int n = input.nextInt();
    	int arr[] = new int[n];
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=input.nextInt();
    	}
        int p  = 0;
    	Arrays.sort(arr);
        int sm = arr[0];
    	int count=100;
    	int i=0;
    	
    while(count!=0 && arr[n-1]>0)	
    {	
    	count = 0;
        sm  = arr[p];

    	for(i=p;i<n;i++)
    	{
    		
    		arr[i]=arr[i]-sm;
    		count++;
    		
    		if(i>=0)
    		{
	    		if(arr[i]>0 && arr[i-1]==0)
	    		{
	    			p=i;
	                
	    		}
    		}

    	}
    	
    	if(count!=0)
    	System.out.println(count);
 
    }

    }
}