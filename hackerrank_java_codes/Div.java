

package hackerrank;
import java.util.*;
public class Div {
	
	
   public static void main(String[] args) {
     
   	
   	Scanner input = new Scanner(System.in);
   	
   	int t = input.nextInt();
   	

   	for(int k=0;k<t;k++)
   	{
   		int n = input.nextInt();
   		//System.out.println("ok");
   	   	int arr[] = new int[n];
   	   	int sum;
   	   	int flag=0;
   		for(int i=0;i<n;i++)
   		{
   			arr[i] = input.nextInt();
   		}
   		
   		for(int i = 0;i<n;i++)
   		{
   		

   			sum=0;
   			for(int j=i;j<n;j++)
   			{
   				sum = sum+arr[j];
   				
   				if(sum%n==0)
   				{
   					System.out.println((i+1)+" "+(j+1));
   				        break;
   				}
   				
   		 
   			}
   			
   		}
   		
   		
   	}
   	
   	
   	
   }
}