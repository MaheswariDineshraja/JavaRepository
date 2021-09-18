package MyPack;

import java.util.Scanner;

public class Assign_2_PrintNumSeries {
	
	int n, i;
	public Assign_2_PrintNumSeries () // constructor
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER:");
		n=sc.nextInt();	
	}
	
	public void PrintSeries()
	{
		for(i=1; i<=n; i+=2)
		{
			System.out.println("The series of given number is:\n"+i);	
		}	
	
	}	
	
	public static void main(String[] args) 
	{		
		Assign_2_PrintNumSeries A1=new Assign_2_PrintNumSeries();
		A1.PrintSeries();
	}

}
