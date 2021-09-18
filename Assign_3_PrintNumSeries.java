package MyPack;

import java.util.Scanner;

public class Assign_3_PrintNumSeries {

	public static void main(String[] args) 
	{
		
		int n, n1=1,n2=2,n3;		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER:");
		n=sc.nextInt();			
		System.out.println(" " + n1+" \n "+n2);
		for(int i=2; i<n;++i)
		{
			n3=n1*n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
