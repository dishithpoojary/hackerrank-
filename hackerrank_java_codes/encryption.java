package hackerrank;
import java.util.*;

public class encryption {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int crt,cceil;
		String st = input.nextLine();
		int k = 0;
		
		st = st.replace(" ","");
		
		
		crt = (int)Math.sqrt(st.length());
		cceil = (int)Math.ceil(Math.sqrt(st.length())); 
		
		if(crt*cceil<st.length())
		{
			crt = cceil;
		}
		
		char arr[][] = new char[crt][cceil];
		
		
		for(int i = 0 ; i<crt; i++)
		{
			for(int j = 0 ; j<cceil; j++)
			{
				
				if(k<st.length())
				arr[i][j]=st.charAt(k);
				else
				arr[i][j]=' ';
					
				//System.out.print(st.charAt(k));
				
					
				k++;
			}
			
		}
		
		
		
		for(int i =0 ;i<cceil;i++)
		{
			for(int j = 0;j<crt;j++)
			{
				if(arr[j][i]!=' ')
				System.out.print(arr[j][i]);
			}
		System.out.print(" ");
		
		}
	}

}
