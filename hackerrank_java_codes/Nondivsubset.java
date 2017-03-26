package hackerrank;

import java.util.*;

public class Nondivsubset {
	
	public static void main(String[] args) {
       
	Scanner input = new Scanner(System.in);	
	
	int n = input.nextInt();
	int k = input.nextInt();
	int flag =0;
	int count = 0; 
	
	int arr[] = new int[n];
	
	for(int i=0;i<n;i++)
	{
		arr[i]=input.nextInt();
	}
		
	
	
	for(int i=0;i<n;i++)
	{
		flag = 0;
		for(int j=i+1;j<n;j++)
		{
			if((arr[i]+arr[j])%k==0)
			{
				flag = 1;
				
			}
			
			if(flag==0)
			{
				System.out.println(arr[i]+"-");
				count++;
			}
			
		}
	}
		
	System.out.println(count);
	
	 
    }
	
	

}
