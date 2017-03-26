package hackerrank;

import java.util.*;

public class Tomoon {
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		long n = input.nextInt();
		int p = input.nextInt();
		
		int country[] = new int[(int)n];
		
		int tno = 1;

		int p1,p2;
		int temptno;
		
		int similar[] = new int[(int)n];
		
		for(int i = 0 ;i<p;i++ )
		{
			p1 = input.nextInt();
			p2 = input.nextInt();
			
			if(country[p1]==0 && country[p2]==0)
			{
				country[p1] = tno;
				country[p2] = tno;
				similar[country[p1]] = tno;
				tno++;
			}
			else if(country[p1]!=0 && country[p2]==0)
			{
				country[p2] = country[p1];
				similar[country[p1]] =country[p1];
				
			}
			else if(country[p1]==0 && country[p2]!=0)
			{
				country[p1] = country[p2];
				similar[country[p1]] = country[p2];
			}
			else if(country[p1]!=0 && country[p2]!=0)
			{
				temptno = (country[p1]<country[p2])?country[p1]:country[p2];
				similar[country[p1]] = temptno;
				similar[country[p2]] = temptno;
			}		
		}
		
		
		for(int i=0;i<n;i++)
		{
			if(country[i]!=0)
			country[i] = similar[country[i]];
		}
		
		int count[] = new int[tno];
		for(int i = 0;i<n;i++)
		{
			count[country[i]]++;
		}
		
		
		long sumtot = n*(n-1)/2;
		

		//System.out.println(sumtot);
		
		int sumcount = 0;
		
		for(int i=1;i<tno;i++)
		{
			sumcount = sumcount+((count[i])*(count[i]-1)/2);
		}
		
		
		
		System.out.println(sumtot-sumcount);
		
		
		/*for(int i=0;i<n;i++)
			System.out.println(country[i]);*/ 
		
		/*for(int i=0;i<tno;i++)
			System.out.println(count[i]);*/ 
		
	}

}
