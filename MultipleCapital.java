package MyPack;

import java.util.Scanner;

public class MultipleCapital {
	
	public static void main(String[] args)
	{
		int num; // it is the int variable, accept only number
		String ch;
		Scanner sc=new Scanner(System.in); // its is used to accept the input
		do
		{
		System.out.println("1.India\n2.Singapore\n3.srilanka\n4.Japan)");
		
		System.out.println("Enter your choice between 1 to 4");
		num=sc.nextInt(); //  its accepting value(user entry is string) and converting int to integer
		switch(num)
		{
		case 1: System.out.println("\nCapital of India is Delhi");
		break;
		case 2: System.out.println("\nCapital of Singapore is Singapore");
		break;
		case 3: System.out.println("\nCapital of SriLanka is Columbu");
		break;
		case 4: System.out.println("\nCapital of Japan is Tokyo");
		break;
		default:
			System.out.println("\nPlease check input");	
		}
		System.out.println("\nDo you want to continue (yes/No)");	
		ch=sc.next();
		}while(ch.equals("yes"));
		

	}

}
