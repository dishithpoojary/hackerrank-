package hackerrank;



import java.util.*;
public class Vivek {
	
	
   public static void main(String[] args) {
     
   	
   	Scanner input = new Scanner(System.in);
   	
   	int n = input.nextInt();
   	int arr[] = new int[n];
   	int count = 0;
   	
   	for(int i=0;i<n;i++)
   	{
   		arr[i] = input.nextInt();
 		
   	}
   	int com;
   	int flag = 0;
   	for(int i=0;i<n;i++)
   	{
   		com = arr[i];
               flag = 0;
   		for(int j=i+1;j<n;j++)
   		{
   			if(arr[j]>com&&flag==0)
   			{
   				flag = 1;
   			}
   			if(flag==0 && com==arr[j])
   			{
   				count++;
   			}
   			
   			
   		}
   	}
   	
   	
   	System.out.println(count*2);
   	
   }
}