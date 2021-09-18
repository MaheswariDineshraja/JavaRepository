package MyPack;

import java.util.Scanner;

public class Assign_1_Factorial {
	
	int n;		
	
	public Assign_1_Factorial()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		n=sc.nextInt();	
		int i,j=1;
		for(i=1; i<=n;i++)
		{
			j=j*i;			
		}
		System.out.println("The Factorial of given number is:\n"+j);
		
	}	

	public static void main(String[] args) 
	{		
		Assign_1_Factorial A1=new Assign_1_Factorial();
	}

}
