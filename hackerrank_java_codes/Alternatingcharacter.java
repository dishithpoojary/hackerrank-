package hackerrank;

import java.util.*;

public class Alternatingcharacter {

	
	public static void main(String args[])
	{
	Scanner input = new Scanner(System.in);
	int counter = 0;
	int t = input.nextInt();
	
	for(int i=0;i<t;i++){
		
		String st = input.next();	
		counter=0;
		for(int j=0;j<st.length()-1;j++)
		{
			
				if(st.charAt(j)==st.charAt(j+1) )
				{
					counter++;
				}
		
			
		}
		
		System.out.println(counter);
		
	}
	
	
	
	
	
	}
}
