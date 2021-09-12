package MyPack;

import java.util.Scanner;

// accept age from user and display message whether he/she able to
// vote or not

public class votting {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age; // int as primitive data type
		// int is adata type
		// age is avariable which will accept numerical data which will accepts the number
		
		System.out.println("Enter Your Age");		
		Scanner sc=new Scanner(System.in);		
		age=sc.nextInt();// it will always accepts the value as string 
		// nextint which will convert the string to integer
		
		if(age>=18)
		{
			System.out.println("you can vote");
		}
		else
		{
			System.out.println("you can not 1vote");
		}
		

	}

}
